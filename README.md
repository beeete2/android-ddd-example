Android DDD Example
--

## 連絡先(Contact)

- 名前(FullName)
  - 姓(LastName)
  - 名(FirstName)
- 電話番号(PhoneNumber)
- メールアドレス(Email)

## 機能(Features)

- 追加(create)
- 更新(update)
- 削除(delete)
- 電話番号重複防止(overlapping)

## 制約（Rules）

### 名前(FullName)

- 姓 NonNull
- 名 NonNull

### 姓(LastName)

- 1文字以上

### 名(FirstName)

- 1文字以上

### 電話番号(PhoneNumber)
- 0から始まる
- 重複不可

### メールアドレス(Email)
- @が含まれる

package e95;

/* loaded from: classes12.dex */
public abstract class b extends android.database.sqlite.SQLiteClosable {

    /* renamed from: d, reason: collision with root package name */
    public android.util.SparseArray f250395d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f250396e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f250397f;

    /* renamed from: g, reason: collision with root package name */
    public e95.a f250398g;

    public b(boolean z17) {
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CursorDataWindow", "clearData");
        this.f250395d.clear();
        this.f250396e.clear();
    }

    public boolean b(int i17) {
        return this.f250395d.indexOfKey(i17) > -1;
    }

    public abstract e95.a c();

    public int f() {
        return this.f250395d.size();
    }

    public e95.a getItem(int i17) {
        if (!b(i17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CursorDataWindow", "newcursor cursor getItem error: pos " + i17 + " loaded num :" + this.f250395d.size());
            return null;
        }
        java.lang.Object obj = this.f250395d.get(i17);
        java.util.HashMap hashMap = this.f250396e;
        e95.a aVar = (e95.a) hashMap.get(obj);
        if (aVar != null) {
            return aVar;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CursorDataWindow", "get data null %s", obj);
        java.util.ArrayList arrayList = this.f250397f;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.ArrayList i18 = i(this.f250397f);
            if (i18 != null) {
                for (int i19 = 0; i19 < i18.size(); i19++) {
                    e95.a aVar2 = (e95.a) i18.get(i19);
                    if (aVar2 != null) {
                        hashMap.put(aVar2.getKey(), aVar2);
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.CursorDataWindow", "newcursor obj is null");
                    }
                }
            }
            this.f250397f.clear();
        }
        e95.a aVar3 = (e95.a) hashMap.get(obj);
        if (aVar3 != null) {
            return aVar3;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CursorDataWindow", "newcursor error obj : " + obj + "pos:" + i17);
        return aVar3;
    }

    public abstract java.util.ArrayList i(java.util.ArrayList arrayList);

    public void j(int i17, int i18) {
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CursorDataWindow", "newcursor rowEnd with error %d rowNum : %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            this.f250395d.remove(i17);
            return;
        }
        e95.a aVar = this.f250398g;
        if (aVar != null) {
            java.lang.Object key = aVar.getKey();
            this.f250396e.put(key, this.f250398g);
            this.f250395d.put(i17, key);
        }
    }

    public boolean n0(java.lang.Object obj) {
        boolean z17 = obj instanceof java.lang.Object[];
        java.util.HashMap hashMap = this.f250396e;
        if (z17) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            if (objArr.length == 1) {
                return hashMap != null && hashMap.containsKey(objArr[0]);
            }
        }
        return hashMap != null && hashMap.containsKey(obj);
    }

    @Override // android.database.sqlite.SQLiteClosable
    public void onAllReferencesReleased() {
        a();
    }

    public boolean t(java.lang.Object obj, e95.a aVar) {
        boolean z17;
        java.util.HashMap hashMap = this.f250396e;
        if (aVar != null) {
            java.util.Objects.toString(obj);
            aVar.toString();
            hashMap.put(obj, aVar);
            return false;
        }
        if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            for (java.lang.Object obj2 : objArr) {
                hashMap.remove(obj2);
            }
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            int i17 = 0;
            for (int i18 = 0; i18 < this.f250395d.size(); i18++) {
                int keyAt = this.f250395d.keyAt(i18);
                java.lang.Object valueAt = this.f250395d.valueAt(i18);
                int length = objArr.length;
                int i19 = 0;
                while (true) {
                    if (i19 >= length) {
                        z17 = true;
                        break;
                    }
                    if (objArr[i19].equals(valueAt)) {
                        i17++;
                        z17 = false;
                        break;
                    }
                    i19++;
                }
                if (z17) {
                    sparseArray.put(keyAt - i17, valueAt);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CursorDataWindow", "newcursor delete index : " + i18 + " obj : " + valueAt);
                }
            }
            if (this.f250395d.size() != sparseArray.size()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CursorDataWindow", "newcursor oldposition size :" + this.f250395d.size() + " newposistion Size : " + sparseArray.size());
            }
            this.f250395d = sparseArray;
        } else {
            if (this.f250397f == null) {
                this.f250397f = new java.util.ArrayList();
            }
            if (!this.f250397f.contains(obj)) {
                this.f250397f.add(obj);
                com.tencent.mars.xlog.Log.i("MicroMsg.CursorDataWindow", "newcursor cursor clearData : " + obj);
            }
            hashMap.remove(obj);
        }
        return false;
    }
}

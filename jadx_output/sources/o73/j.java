package o73;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lo73/j;", "Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lo73/b;", "Ln75/b;", "dbProvider", "<init>", "(Ln75/b;)V", "o73/f", "plugin-hashinfo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class j extends com.tencent.mm.sdk.storage.mvvm.MvvmStorage<o73.b> {

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f343551o = gm0.j1.u().h() + "HashInfo.db";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f343552h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f343553i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f343554m;

    /* renamed from: n, reason: collision with root package name */
    public final o73.f f343555n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n75.b dbProvider) {
        super(dbProvider);
        kotlin.jvm.internal.o.g(dbProvider, "dbProvider");
        this.f343552h = "";
        this.f343553i = "";
        this.f343554m = "";
        pm0.v.L("HashUserNameMapStorage_INIT", true, new o73.c(this, dbProvider));
        this.f343555n = new o73.f();
    }

    public static final o73.b Y6(o73.j jVar, java.lang.String str) {
        jVar.getClass();
        if (str == null || r26.n0.N(str)) {
            return null;
        }
        p75.n0 TABLE = p73.a.f352501h;
        kotlin.jvm.internal.o.f(TABLE, "TABLE");
        p75.d USERNAME = p73.a.f352502i;
        kotlin.jvm.internal.o.f(USERNAME, "USERNAME");
        p75.i0 i17 = TABLE.i();
        com.tencent.mm.sdk.platformtools.t8.n(str);
        kotlin.jvm.internal.o.f(str, "escapeSqlValue(...)");
        i17.f352657d = USERNAME.j(str);
        return (o73.b) i17.a().o(jVar.f193147g.Q4(), o73.b.class);
    }

    public final java.lang.String X6(java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
            java.nio.charset.Charset charset = r26.c.f368865a;
            byte[] bytes = str2.getBytes(charset);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            mac.init(new javax.crypto.spec.SecretKeySpec(bytes, "HmacSHA256"));
            if (str != null) {
                bArr = str.getBytes(charset);
                kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
            } else {
                bArr = null;
            }
            java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(mac.doFinal(bArr));
            kotlin.jvm.internal.o.f(l17, "encodeHexString(...)");
            return l17;
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public final java.lang.String Z6() {
        java.lang.String d76;
        java.lang.String str = this.f343553i;
        if (str == null || r26.n0.N(str)) {
            java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SALT_STRING_SYNC, null);
            if (v17 == null || r26.n0.N(v17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.HashInfo.HashUserNameMapStorage", "ACC_SALT is empty");
                d76 = "";
            } else {
                kotlin.jvm.internal.o.d(v17);
                d76 = d7(v17, "64ad9fafb003525bbc9f8fb1a3cd271e8efc2002c3a3d23806ad66e165325d4e");
            }
            this.f343553i = d76;
        }
        return this.f343553i;
    }

    public final java.lang.String a7() {
        java.lang.String d76;
        java.lang.String str = this.f343552h;
        if (str == null || r26.n0.N(str)) {
            java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SALT_STRING_SYNC, null);
            if (v17 == null || r26.n0.N(v17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.HashInfo.HashUserNameMapStorage", "ACC_SALT is empty");
                d76 = "";
            } else {
                kotlin.jvm.internal.o.d(v17);
                d76 = d7(v17, "765272c5645917a2578092a523cd2a37ccf0b352d16d9744d5b5bd4668e71c4a");
            }
            this.f343552h = d76;
        }
        return this.f343552h;
    }

    public final void b4(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        java.lang.String a76 = a7();
        if ((a76 == null || a76.length() == 0) || r26.n0.N(userName)) {
            return;
        }
        pm0.v.L("MicroMsg.HashInfo.HashUserNameMapStorage", true, new o73.h(this, userName));
    }

    public final java.lang.String b7() {
        java.lang.String str = this.f343554m;
        if (str == null || r26.n0.N(str)) {
            this.f343554m = d7("5feceb66ffc86f38d952786c6d696c79c2dbc239dd4e91b46729d73a27fb57e9", "f0390fff96a5ab7168f9e9a6f8e9f4f4bdd87d2be99f7d27faf19dfc0725e875");
        }
        return this.f343554m;
    }

    public final java.lang.String c7(java.lang.String hashUserName, int i17) {
        p75.d HASHUSERNAME;
        if (hashUserName == null || r26.n0.N(hashUserName)) {
            return null;
        }
        o73.f fVar = this.f343555n;
        fVar.getClass();
        kotlin.jvm.internal.o.g(hashUserName, "hashUserName");
        o73.b a17 = fVar.a(new o73.d(i17, hashUserName));
        if (a17 == null) {
            p75.n0 TABLE = p73.a.f352501h;
            kotlin.jvm.internal.o.f(TABLE, "TABLE");
            if (i17 == 1) {
                HASHUSERNAME = p73.a.f352503m;
                kotlin.jvm.internal.o.f(HASHUSERNAME, "HASHUSERNAME");
            } else if (i17 != 3) {
                HASHUSERNAME = p73.a.f352504n;
                kotlin.jvm.internal.o.f(HASHUSERNAME, "COMMHASHUSERNAME");
            } else {
                HASHUSERNAME = p73.a.f352505o;
                kotlin.jvm.internal.o.f(HASHUSERNAME, "HARDCODEHASHUSERNAME");
            }
            p75.i0 i18 = TABLE.i();
            com.tencent.mm.sdk.platformtools.t8.n(hashUserName);
            i18.f352657d = HASHUSERNAME.j(hashUserName);
            a17 = (o73.b) i18.a().o(this.f193147g.Q4(), o73.b.class);
            if (a17 != null) {
                fVar.b(a17);
            }
        }
        if (a17 != null) {
            return a17.field_UserName;
        }
        return null;
    }

    public final java.lang.String d7(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(str.length());
        int i17 = 0;
        int i18 = 0;
        while (i17 < str.length()) {
            arrayList.add(java.lang.Character.valueOf((char) (str2.charAt(i18) ^ str.charAt(i17))));
            i17++;
            i18++;
        }
        return kz5.n0.g0(arrayList, "", null, null, 0, null, o73.i.f343550d, 30, null);
    }
}

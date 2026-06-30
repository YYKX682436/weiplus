package com.tencent.mm.vfs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.vfs.v f213212e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.vfs.v[] f213213f;

    /* renamed from: d, reason: collision with root package name */
    public final int f213214d;

    static {
        com.tencent.mm.vfs.v vVar = new com.tencent.mm.vfs.v(com.tencent.wcdb.database.SQLiteGlobal.defaultJournalMode, 0, 0);
        com.tencent.mm.vfs.v vVar2 = new com.tencent.mm.vfs.v("LRU_EXPIRE", 1, 1);
        com.tencent.mm.vfs.v vVar3 = new com.tencent.mm.vfs.v("EXPIRE", 2, 2);
        f213212e = vVar3;
        com.tencent.mm.vfs.v[] vVarArr = {vVar, vVar2, vVar3, new com.tencent.mm.vfs.v("LRU", 3, 3)};
        f213213f = vVarArr;
        rz5.b.a(vVarArr);
    }

    public v(java.lang.String str, int i17, int i18) {
        this.f213214d = i18;
    }

    public static com.tencent.mm.vfs.v valueOf(java.lang.String str) {
        return (com.tencent.mm.vfs.v) java.lang.Enum.valueOf(com.tencent.mm.vfs.v.class, str);
    }

    public static com.tencent.mm.vfs.v[] values() {
        return (com.tencent.mm.vfs.v[]) f213213f.clone();
    }
}

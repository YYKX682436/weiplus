package com.tencent.mm.ui.tipsbar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.tipsbar.c f209922d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.tipsbar.c f209923e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.tipsbar.c[] f209924f;

    static {
        com.tencent.mm.ui.tipsbar.c cVar = new com.tencent.mm.ui.tipsbar.c("MODE_FOLD", 0);
        f209922d = cVar;
        com.tencent.mm.ui.tipsbar.c cVar2 = new com.tencent.mm.ui.tipsbar.c("MODE_EXPAND", 1);
        f209923e = cVar2;
        com.tencent.mm.ui.tipsbar.c[] cVarArr = {cVar, cVar2};
        f209924f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.ui.tipsbar.c valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.tipsbar.c) java.lang.Enum.valueOf(com.tencent.mm.ui.tipsbar.c.class, str);
    }

    public static com.tencent.mm.ui.tipsbar.c[] values() {
        return (com.tencent.mm.ui.tipsbar.c[]) f209924f.clone();
    }
}

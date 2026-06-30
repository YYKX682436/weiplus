package com.tencent.mm.plugin.lite.jsapi.comms;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class e8 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.lite.jsapi.comms.e8 f143568d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.lite.jsapi.comms.e8 f143569e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.lite.jsapi.comms.e8 f143570f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.e8[] f143571g;

    static {
        com.tencent.mm.plugin.lite.jsapi.comms.e8 e8Var = new com.tencent.mm.plugin.lite.jsapi.comms.e8("SUCCESS", 0, 0);
        f143568d = e8Var;
        com.tencent.mm.plugin.lite.jsapi.comms.e8 e8Var2 = new com.tencent.mm.plugin.lite.jsapi.comms.e8("CANCEL", 1, 1);
        f143569e = e8Var2;
        com.tencent.mm.plugin.lite.jsapi.comms.e8 e8Var3 = new com.tencent.mm.plugin.lite.jsapi.comms.e8("FAIL", 2, 2);
        f143570f = e8Var3;
        com.tencent.mm.plugin.lite.jsapi.comms.e8[] e8VarArr = {e8Var, e8Var2, e8Var3};
        f143571g = e8VarArr;
        rz5.b.a(e8VarArr);
    }

    public e8(java.lang.String str, int i17, int i18) {
    }

    public static com.tencent.mm.plugin.lite.jsapi.comms.e8 valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.lite.jsapi.comms.e8) java.lang.Enum.valueOf(com.tencent.mm.plugin.lite.jsapi.comms.e8.class, str);
    }

    public static com.tencent.mm.plugin.lite.jsapi.comms.e8[] values() {
        return (com.tencent.mm.plugin.lite.jsapi.comms.e8[]) f143571g.clone();
    }
}

package wd0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h1 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ wd0.h1[] f444724e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f444725d;

    static {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n6b);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        wd0.h1 h1Var = new wd0.h1("CLOSE", 0, string, "OldModelReactivation_YS_SNR_NA_AUD1.wav");
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n6b);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        wd0.h1 h1Var2 = new wd0.h1("NONE", 1, string2, "OldModelReactivation_YS_SNR_NA_AUD1.wav");
        java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n6d);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        wd0.h1 h1Var3 = new wd0.h1("STEEP_DECLINE", 2, string3, "OldModelReactivation_DJ_SNR_NA_AUD1.wav");
        java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n6a);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        wd0.h1 h1Var4 = new wd0.h1("GRADUAL_DECLINE", 3, string4, "gradual_decline_type.wav");
        java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n6_);
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        wd0.h1 h1Var5 = new wd0.h1("FLAT_DECLINE", 4, string5, "OldModelReactivation_PX_SNR_NA_AUD1.wav");
        java.lang.String string6 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n6c);
        kotlin.jvm.internal.o.f(string6, "getString(...)");
        wd0.h1[] h1VarArr = {h1Var, h1Var2, h1Var3, h1Var4, h1Var5, new wd0.h1("RISING", 5, string6, "OldModelReactivation_PS_SNR_NA_AUD1.wav")};
        f444724e = h1VarArr;
        rz5.b.a(h1VarArr);
    }

    public h1(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f444725d = str3;
    }

    public static wd0.h1 valueOf(java.lang.String str) {
        return (wd0.h1) java.lang.Enum.valueOf(wd0.h1.class, str);
    }

    public static wd0.h1[] values() {
        return (wd0.h1[]) f444724e.clone();
    }
}

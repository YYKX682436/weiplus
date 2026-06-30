package mq0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final mq0.a0 f330532e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ mq0.a0[] f330533f;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f330534d;

    static {
        mq0.a0 a0Var = new mq0.a0("MB", 0, "MB");
        f330532e = a0Var;
        mq0.a0[] a0VarArr = {a0Var, new mq0.a0(com.tencent.shadow.core.common.HostConstants.COVERVIEW_DELEGATE, 1, "coverview")};
        f330533f = a0VarArr;
        rz5.b.a(a0VarArr);
    }

    public a0(java.lang.String str, int i17, java.lang.String str2) {
        this.f330534d = str2;
    }

    public static mq0.a0 valueOf(java.lang.String str) {
        return (mq0.a0) java.lang.Enum.valueOf(mq0.a0.class, str);
    }

    public static mq0.a0[] values() {
        return (mq0.a0[]) f330533f.clone();
    }
}

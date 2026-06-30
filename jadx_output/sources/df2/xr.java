package df2;

/* loaded from: classes10.dex */
public final class xr extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final df2.xr f231800d = new df2.xr();

    public xr() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk2.h it = (dk2.h) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.protocal.protobuf.NativeInfo native_info = it.f233541d.getNative_info();
        return java.lang.Boolean.valueOf(native_info != null && native_info.getNative_type() == 9);
    }
}

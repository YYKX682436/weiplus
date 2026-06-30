package uo;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final uo.b f429505d = new uo.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (android.os.Build.VERSION.SDK_INT != 30 || com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().targetSdkVersion < 30) ? java.lang.Boolean.FALSE : !mm.k.j(mm.k.f328501l1, null, 1, null) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }
}

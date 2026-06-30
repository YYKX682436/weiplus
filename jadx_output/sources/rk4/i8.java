package rk4;

/* loaded from: classes11.dex */
public final class i8 implements qi0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f396737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.flutter.ui.FlutterPageStyle f396738c;

    public i8(rk4.k8 k8Var, pi0.l1 l1Var, com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle) {
        this.f396736a = k8Var;
        this.f396737b = l1Var;
        this.f396738c = flutterPageStyle;
    }

    @Override // qi0.h
    public java.lang.Object a(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        rk4.k8 k8Var = this.f396736a;
        kotlinx.coroutines.l.d(k8Var, null, null, new rk4.h8(str2, k8Var, context, this.f396737b, str, map, this.f396738c, null), 3, null);
        return jz5.f0.f302826a;
    }
}

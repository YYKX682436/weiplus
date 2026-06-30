package j8;

/* loaded from: classes15.dex */
public class c implements j8.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodChannel.Result f298093a;

    public c(j8.d dVar, io.flutter.plugin.common.MethodChannel.Result result) {
        this.f298093a = result;
    }

    @Override // j8.a
    public void a(j8.h hVar) {
        this.f298093a.success(hVar.name());
    }
}

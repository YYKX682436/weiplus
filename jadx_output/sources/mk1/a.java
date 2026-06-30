package mk1;

/* loaded from: classes7.dex */
public final class a implements mk1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk1.v f327090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f327091b;

    public a(mk1.v vVar, android.os.Handler handler) {
        this.f327090a = vVar;
        this.f327091b = handler;
    }

    @Override // mk1.v
    public final ye1.r a(mk1.b0 dataSource) {
        ye1.r a17;
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandExoThumbCompositeMediaPlayerProvider", "provide, LuggageExoMediaPlayer");
        mk1.v vVar = this.f327090a;
        return (vVar == null || (a17 = vVar.a(dataSource)) == null) ? new af1.i0(this.f327091b) : a17;
    }
}

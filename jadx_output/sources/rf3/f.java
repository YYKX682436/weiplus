package rf3;

/* loaded from: classes12.dex */
public final class f extends lf3.n implements sf3.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // sf3.f
    public sf3.k Q3(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        return sf3.k.f407400h;
    }

    @Override // sf3.f
    public void W4(mf3.k mediaInfo, sf3.l listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        sf3.g e17 = mediaInfo.e();
        if (e17 == null) {
            return;
        }
        listener.f(sf3.k.f407397e, e17.b(sf3.m.f407403e, sf3.m.f407404f, sf3.m.f407406h), mediaInfo.getLevel());
    }
}

package rh5;

/* loaded from: classes3.dex */
public class a extends lf3.n implements yf3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // yf3.a
    public void n3(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        if (mediaInfo.getType() == mf3.u.f326123e) {
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, getActivity().getIntent().getIntExtra("key_favorite_source_type", 37), mediaInfo.g());
            doFavoriteEvent.f54090g.f6323i = getActivity();
            doFavoriteEvent.e();
        }
    }
}

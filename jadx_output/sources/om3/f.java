package om3;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f346401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView f346402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView tingMusicLyricsView) {
        super(0);
        this.f346401d = context;
        this.f346402e = tingMusicLyricsView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new om3.i(this.f346401d, this.f346402e);
    }
}

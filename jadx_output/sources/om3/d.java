package om3;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f346398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.open.text_status.MusicMvView f346399e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, com.tencent.mm.plugin.mv.ui.open.text_status.MusicMvView musicMvView) {
        super(0);
        this.f346398d = context;
        this.f346399e = musicMvView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new om3.c(this.f346398d, this.f346399e);
    }
}

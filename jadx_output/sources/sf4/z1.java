package sf4;

/* loaded from: classes4.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f407624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f407626f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f407627g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(sf4.j2 j2Var, java.lang.String str, long j17, long j18) {
        super(0);
        this.f407624d = j2Var;
        this.f407625e = str;
        this.f407626f = j17;
        this.f407627g = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = this.f407624d.f407499a;
        if (storyVideoView != null) {
            storyVideoView.onDataAvailable(this.f407625e, this.f407626f, this.f407627g);
        }
        return jz5.f0.f302826a;
    }
}

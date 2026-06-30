package th5;

/* loaded from: classes12.dex */
public final class k extends lf3.n implements zf3.a {

    /* renamed from: d, reason: collision with root package name */
    public final zh5.v f419394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f419394d = new zh5.v(activity);
    }

    @Override // zf3.a
    public void I(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        if (mediaInfo.getType() == mf3.u.f326125g) {
            mediaInfo = new th5.j(mediaInfo, mediaInfo instanceof th5.q ? (th5.q) mediaInfo : null);
        }
        this.f419394d.I(mediaInfo);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        this.f419394d.onActivityResult(i17, i18, intent);
    }

    @Override // zf3.a
    public void z4(mf3.k mediaInfo, java.lang.String userName) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(userName, "userName");
        if (mediaInfo.getType() == mf3.u.f326125g) {
            mediaInfo = new th5.j(mediaInfo, mediaInfo instanceof th5.q ? (th5.q) mediaInfo : null);
        }
        this.f419394d.z4(mediaInfo, userName);
    }
}

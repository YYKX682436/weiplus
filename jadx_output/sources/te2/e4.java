package te2;

/* loaded from: classes2.dex */
public final class e4 extends com.tencent.mm.ui.component.UIComponent implements zy2.g8 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.s3 f417974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f417974d = new com.tencent.mm.plugin.finder.feed.model.s3(activity);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f417974d.onDetach();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f417974d = new com.tencent.mm.plugin.finder.feed.model.s3(fragment);
    }
}

package cw3;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f224155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.view.BehaviorStatusView f224156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, com.tencent.mm.plugin.recordvideo.ui.editor.view.BehaviorStatusView behaviorStatusView) {
        super(0);
        this.f224155d = context;
        this.f224156e = behaviorStatusView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this.f224155d);
        com.tencent.mm.plugin.recordvideo.ui.editor.view.BehaviorStatusView behaviorStatusView = this.f224156e;
        weImageView.setImageResource(behaviorStatusView.f156432f.f224157a);
        weImageView.setIconColor(behaviorStatusView.f156432f.f224160d);
        return weImageView;
    }
}

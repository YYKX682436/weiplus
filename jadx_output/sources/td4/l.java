package td4;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f417697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.View view) {
        super(0);
        this.f417697d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder$loadingTv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder$loadingTv$2");
        android.widget.TextView textView = (android.widget.TextView) this.f417697d.findViewById(com.tencent.mm.R.id.ili);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder$loadingTv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder$loadingTv$2");
        return textView;
    }
}

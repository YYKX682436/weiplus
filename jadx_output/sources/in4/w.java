package in4;

/* loaded from: classes8.dex */
public class w extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f292996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog f292997e;

    public w(com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog, int i17) {
        this.f292997e = topStoryCommentFloatDialog;
        this.f292996d = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog topStoryCommentFloatDialog = this.f292997e;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) topStoryCommentFloatDialog.f175256d.getLayoutParams();
        layoutParams.bottomMargin = (int) (this.f292996d * f17);
        topStoryCommentFloatDialog.f175256d.setLayoutParams(layoutParams);
    }
}

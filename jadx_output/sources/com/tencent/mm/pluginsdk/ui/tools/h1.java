package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView f191676d;

    public h1(com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView fileSelectorFolderView) {
        this.f191676d = fileSelectorFolderView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorFolderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView fileSelectorFolderView = this.f191676d;
        boolean z17 = fileSelectorFolderView.f191364g;
        if (z17 && !fileSelectorFolderView.f191365h) {
            if (z17) {
                fileSelectorFolderView.f191365h = true;
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(fileSelectorFolderView.getContext(), com.tencent.mm.R.anim.f477855dd);
                loadAnimation.setAnimationListener(new com.tencent.mm.pluginsdk.ui.tools.f1(fileSelectorFolderView));
                fileSelectorFolderView.f191363f.startAnimation(loadAnimation);
                fileSelectorFolderView.f191362e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(fileSelectorFolderView.getContext(), com.tencent.mm.R.anim.f477784bd));
            } else {
                fileSelectorFolderView.f191365h = true;
                fileSelectorFolderView.f191361d.setVisibility(0);
                fileSelectorFolderView.f191362e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(fileSelectorFolderView.getContext(), com.tencent.mm.R.anim.f477783bc));
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(fileSelectorFolderView.getContext(), com.tencent.mm.R.anim.f477857df);
                loadAnimation2.setAnimationListener(new com.tencent.mm.pluginsdk.ui.tools.g1(fileSelectorFolderView));
                fileSelectorFolderView.f191363f.startAnimation(loadAnimation2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorFolderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

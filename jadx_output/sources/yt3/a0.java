package yt3;

/* loaded from: classes5.dex */
public final class a0 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f465334f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f465335g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f465336h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f465337i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.view.ViewGroup parent, ju3.d0 status, yz5.l halfBottomDialogCreator, yz5.a isCaptureScene) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(halfBottomDialogCreator, "halfBottomDialogCreator");
        kotlin.jvm.internal.o.g(isCaptureScene, "isCaptureScene");
        this.f465334f = halfBottomDialogCreator;
        this.f465335g = isCaptureScene;
        android.widget.ImageView imageView = (android.widget.ImageView) parent.findViewById(com.tencent.mm.R.id.f484177rj4);
        this.f465336h = imageView;
        this.f465337i = kotlinx.coroutines.z0.b();
        if (imageView != null) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(parent.getContext(), com.tencent.mm.R.raw.icons_filled_more2, -1));
        }
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditJumpMorePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.ui.widget.dialog.z2) this.f465334f.invoke(this.f465337i)).C();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditJumpMorePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.widget.ImageView imageView = this.f465336h;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i17);
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        android.widget.ImageView imageView = this.f465336h;
        if (imageView != null) {
            yt3.c1.f465377s.a(imageView, configProvider.F, ((java.lang.Boolean) this.f465335g.invoke()).booleanValue());
        }
        if (imageView != null) {
            dy1.a.j(imageView, "video_edit_basic_miaojian_jump_pagefrom", 5);
        }
    }
}

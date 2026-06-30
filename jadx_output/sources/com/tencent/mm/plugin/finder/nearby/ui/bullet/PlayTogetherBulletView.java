package com.tencent.mm.plugin.finder.nearby.ui.bullet;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/ui/bullet/PlayTogetherBulletView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PlayTogetherBulletView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public r45.le1 f122110d;

    /* renamed from: e, reason: collision with root package name */
    public zm0.i f122111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayTogetherBulletView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(context, "context");
        ym5.a1.i(this, new vq2.c(this));
        android.content.Context context2 = getContext();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context2 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context2 : null;
        if (appCompatActivity == null || (mo133getLifecycle = appCompatActivity.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView.2
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView.this.a("onDestroy");
            }
        });
    }

    public final void a(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("PlayTogetherBulletView", "onDetach: source=".concat(source));
        zm0.i iVar = this.f122111e;
        if (iVar != null) {
            com.tencent.mars.xlog.Log.i("LinearBulletManager", "release: ");
            iVar.d();
            iVar.f474121b.removeAllViews();
        }
        this.f122111e = null;
        this.f122110d = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayTogetherBulletView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(context, "context");
        ym5.a1.i(this, new vq2.c(this));
        android.content.Context context2 = getContext();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context2 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context2 : null;
        if (appCompatActivity == null || (mo133getLifecycle = appCompatActivity.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView.2
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView.this.a("onDestroy");
            }
        });
    }
}

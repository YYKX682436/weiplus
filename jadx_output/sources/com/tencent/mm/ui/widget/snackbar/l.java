package com.tencent.mm.ui.widget.snackbar;

/* loaded from: classes10.dex */
public class l implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.snackbar.SnackContainer f212480a;

    public l(com.tencent.mm.ui.widget.snackbar.SnackContainer snackContainer) {
        this.f212480a = snackContainer;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.widget.snackbar.h hVar;
        com.tencent.mm.ui.widget.snackbar.SnackContainer snackContainer = this.f212480a;
        snackContainer.removeAllViews();
        java.util.Queue queue = snackContainer.f212459d;
        if (!queue.isEmpty() && (hVar = ((com.tencent.mm.ui.widget.snackbar.n) ((java.util.LinkedList) queue).poll()).f212487e) != null) {
            com.tencent.mm.ui.widget.snackbar.j.f212477a = false;
            hVar.onHide();
        }
        if (queue.isEmpty()) {
            snackContainer.setVisibility(8);
        } else {
            snackContainer.b((com.tencent.mm.ui.widget.snackbar.n) ((java.util.LinkedList) queue).peek(), false);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.ui.widget.snackbar.SnackContainer snackContainer = this.f212480a;
        if (snackContainer.f212459d.isEmpty()) {
            return;
        }
        java.util.Queue queue = snackContainer.f212459d;
        if (((java.util.LinkedList) queue).peek() == null || ((com.tencent.mm.ui.widget.snackbar.n) ((java.util.LinkedList) queue).peek()).f212487e == null) {
            return;
        }
        com.tencent.mm.ui.widget.snackbar.j.f212477a = false;
        ((com.tencent.mm.ui.widget.snackbar.n) ((java.util.LinkedList) queue).peek()).f212487e.a();
    }
}

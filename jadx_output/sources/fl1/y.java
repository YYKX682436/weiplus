package fl1;

/* loaded from: classes14.dex */
public class y implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fl1.b2 f263892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fl1.c0 f263893b;

    public y(fl1.c0 c0Var, fl1.b2 b2Var) {
        this.f263893b = c0Var;
        this.f263892a = b2Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        boolean z17;
        android.view.View contentView;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDialogContainerLayout", "on dialogView start animation end");
        fl1.c0 c0Var = this.f263893b;
        if (c0Var.f263728w) {
            z17 = false;
        } else {
            c0Var.f263728w = true;
            z17 = true;
        }
        java.util.LinkedList linkedList = c0Var.f263716h;
        int size = linkedList.size();
        if (size >= 1) {
        }
        fl1.b2 b2Var = size >= 2 ? (fl1.b2) linkedList.get(size - 2) : null;
        fl1.h2 h2Var = c0Var.f263727v;
        if (h2Var != null) {
            fl1.t tVar = (fl1.t) h2Var;
            tVar.f263869c = true;
            fl1.u uVar = tVar.f263867a;
            uVar.getClass();
            fl1.c0 dialogContainer = tVar.f263868b;
            kotlin.jvm.internal.o.g(dialogContainer, "dialogContainer");
            if (z17) {
                android.view.ViewGroup.LayoutParams layoutParams = dialogContainer.getLayoutParams();
                if (layoutParams != null && -1 == layoutParams.width && -1 == layoutParams.height) {
                    com.tencent.mars.xlog.Log.i(uVar.f263871a, "onDialogShown#[" + dialogContainer + "], isFirstDialog, clear siblings's importantForAccessibility");
                    java.util.Iterator it = uVar.a(dialogContainer).iterator();
                    while (it.hasNext()) {
                        ((android.view.View) it.next()).setImportantForAccessibility(4);
                    }
                }
            }
            if (b2Var != null && (contentView = b2Var.getContentView()) != null) {
                contentView.setImportantForAccessibility(4);
            }
        }
        this.f263892a.m();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}

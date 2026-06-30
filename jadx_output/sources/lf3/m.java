package lf3;

/* loaded from: classes14.dex */
public abstract class m extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f318327d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f318328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.ArrayList<lf3.p> arrayList = new java.util.ArrayList();
        this.f318327d = arrayList;
        this.f318328e = new java.util.HashSet();
        W6();
        for (lf3.p pVar : arrayList) {
            pVar.getClass();
            pf5.z.f353948a.a(activity).a(pVar.f318329a);
            this.f318328e.add((lf3.o) pf5.z.f353948a.a(activity).a(pVar.f318329a));
        }
    }

    public final java.util.List T6() {
        return new java.util.ArrayList(this.f318328e);
    }

    public final void U6(int i17, java.lang.Class clz) {
        kotlin.jvm.internal.o.g(clz, "clz");
        this.f318327d.add(new lf3.p(clz, i17));
    }

    public final void V6(java.lang.Class clz) {
        kotlin.jvm.internal.o.g(clz, "clz");
        this.f318327d.add(new lf3.p(clz, 0));
    }

    public abstract void W6();

    public final void X6(lf3.m mVar, int i17, f06.d implKClz) {
        kotlin.jvm.internal.o.g(mVar, "<this>");
        kotlin.jvm.internal.o.g(implKClz, "implKClz");
        mVar.U6(i17, xz5.a.b(implKClz));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onActivityResult(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.ui.component.UIComponent) it.next()).onBackPressed()) {
                return true;
            }
        }
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        super.onBeforeFinish(intent);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onBeforeFinish(intent);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onBeforeFinishAfterTransition() {
        super.onBeforeFinishAfterTransition();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onBeforeFinishAfterTransition();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onConfigurationChanged(newConfig);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onCreateAfter(bundle);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onCreateBefore(bundle);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onDestroy();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onEnterAnimationComplete();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onFinished();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onInterceptFinish() {
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.ui.component.UIComponent) it.next()).onInterceptFinish()) {
                return true;
            }
        }
        return super.onInterceptFinish();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.ui.component.UIComponent) it.next()).onKeyDown(i17, event)) {
                return true;
            }
        }
        return super.onKeyDown(i17, event);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.ui.component.UIComponent) it.next()).onKeyUp(i17, event)) {
                return true;
            }
        }
        return super.onKeyUp(i17, event);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onNewIntent(intent);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onPause();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPostDestroyed() {
        super.onPostDestroyed();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onPostDestroyed();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPreDestroyed() {
        super.onPreDestroyed();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onPreDestroyed();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onRequestPermissionsResult(i17, permissions, grantResults);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onRestoreInstanceState(bundle);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onResume();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onSaveInstanceState(bundle);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onStart();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.onStartActivityForResult(intent, i17, bundle);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onStartActivityForResult(intent, i17, bundle);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onStop();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onUserVisibleFocused();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onUserVisibleUnFocused();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        for (lf3.p pVar : this.f318327d) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            lf3.o oVar = (lf3.o) pf5.z.f353948a.a(activity).a(pVar.f318329a);
            if (oVar.T6() != 0) {
                androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                int T6 = oVar.T6();
                kotlin.jvm.internal.o.g(activity2, "activity");
                if (T6 != 0) {
                    android.view.LayoutInflater.from(activity2).inflate(T6, (android.view.ViewGroup) contentView.findViewById(pVar.f318330b));
                }
            }
        }
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onViewCreated(contentView);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        java.util.Iterator it = T6().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onWindowFocusChanged(z17);
        }
    }
}

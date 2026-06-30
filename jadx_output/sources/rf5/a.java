package rf5;

/* loaded from: classes15.dex */
public final class a extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f395132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f395132d = new java.util.HashMap();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onActivityResult(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            if (((rf5.b) it6.next()).onBackPressed()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onBeforeFinish(intent);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onConfigurationChanged(newConfig);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onCreateAfter(bundle);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onCreateBefore(bundle);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onDestroy();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            if (((rf5.b) it6.next()).onKeyDown(i17, event)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            if (((rf5.b) it6.next()).onKeyUp(i17, event)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onNewIntent(intent);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onPause();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onRequestPermissionsResult(i17, permissions, grantResults);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onRestoreInstanceState(bundle);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onResume();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onSaveInstanceState(bundle);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onStart();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Collection values = this.f395132d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.LinkedList) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((rf5.b) it6.next()).onStop();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f395132d = new java.util.HashMap();
    }
}

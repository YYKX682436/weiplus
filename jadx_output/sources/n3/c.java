package n3;

/* loaded from: classes14.dex */
public class c {
    private static final android.view.View.AccessibilityDelegate DEFAULT_DELEGATE = new android.view.View.AccessibilityDelegate();
    private final android.view.View.AccessibilityDelegate mBridge;
    private final android.view.View.AccessibilityDelegate mOriginalDelegate;

    public c() {
        this(DEFAULT_DELEGATE);
    }

    public static java.util.List<o3.f> getActionList(android.view.View view) {
        java.util.List<o3.f> list = (java.util.List) view.getTag(com.tencent.mm.R.id.nwf);
        return list == null ? java.util.Collections.emptyList() : list;
    }

    public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public o3.p getAccessibilityNodeProvider(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider a17 = n3.b.a(this.mOriginalDelegate, view);
        if (a17 != null) {
            return new o3.p(a17);
        }
        return null;
    }

    public android.view.View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, lVar.f342642a);
    }

    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        boolean z17;
        java.lang.ref.WeakReference weakReference;
        boolean z18;
        java.util.List<o3.f> actionList = getActionList(view);
        boolean z19 = false;
        int i18 = 0;
        while (true) {
            if (i18 >= actionList.size()) {
                break;
            }
            o3.f fVar = actionList.get(i18);
            if (((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) fVar.f342636a).getId() == i17) {
                o3.a0 a0Var = fVar.f342639d;
                if (a0Var != null) {
                    java.lang.Class cls = fVar.f342638c;
                    if (cls != null) {
                        try {
                            android.support.v4.media.f.a(cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                            throw null;
                        } catch (java.lang.Exception unused) {
                            z17 = a0Var.a(view, null);
                        }
                    }
                    z17 = a0Var.a(view, null);
                }
            } else {
                i18++;
            }
        }
        z17 = false;
        if (!z17) {
            z17 = n3.b.b(this.mOriginalDelegate, view, i17, bundle);
        }
        if (z17 || i17 != com.tencent.mm.R.id.f482349c4 || bundle == null) {
            return z17;
        }
        int i19 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.tencent.mm.R.id.nwg);
        if (sparseArray != null && (weakReference = (java.lang.ref.WeakReference) sparseArray.get(i19)) != null) {
            android.text.style.ClickableSpan clickableSpan = (android.text.style.ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                java.lang.CharSequence text = view.createAccessibilityNodeInfo().getText();
                android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
                for (int i27 = 0; clickableSpanArr != null && i27 < clickableSpanArr.length; i27++) {
                    if (clickableSpan.equals(clickableSpanArr[i27])) {
                        z18 = true;
                        break;
                    }
                }
            }
            z18 = false;
            if (z18) {
                clickableSpan.onClick(view);
                z19 = true;
            }
        }
        return z19;
    }

    public void sendAccessibilityEvent(android.view.View view, int i17) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i17);
    }

    public void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public c(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new n3.a(this);
    }
}

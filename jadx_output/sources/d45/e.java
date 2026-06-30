package d45;

/* loaded from: classes10.dex */
public final class e implements d45.g {
    public void a(d45.i iVar, int i17) {
        if ((iVar != null ? iVar.f226443d : null) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = iVar.f226443d;
        kotlin.jvm.internal.o.d(weakReference);
        android.widget.TextView textView = (android.widget.TextView) weakReference.get();
        if (textView == null) {
            return;
        }
        d45.i.f226441h.a(textView, i17);
        d45.i.f226442i.remove(textView);
    }
}

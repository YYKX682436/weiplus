package f00;

/* loaded from: classes9.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public static f00.d a(f00.a aVar, android.content.Context context, java.lang.String str, long j17, android.content.DialogInterface.OnCancelListener onCancelListener, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            j17 = 500;
        }
        if ((i17 & 8) != 0) {
            onCancelListener = null;
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        f00.d dVar = new f00.d();
        dVar.f258295c = j17;
        new java.lang.ref.WeakReference(context);
        f00.u uVar = new f00.u();
        if (str != null) {
            uVar.f258329c = str;
        }
        uVar.f258330d = onCancelListener;
        uVar.f258331a = new java.lang.ref.WeakReference(context);
        dVar.f258294b = uVar;
        return dVar;
    }
}

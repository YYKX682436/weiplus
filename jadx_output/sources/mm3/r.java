package mm3;

/* loaded from: classes10.dex */
public final class r implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.w f329672d;

    public r(mm3.w wVar) {
        this.f329672d = wVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        java.lang.Object obj;
        mm3.w wVar = this.f329672d;
        yz5.l lVar = wVar.f329680q;
        java.util.Iterator it = wVar.f329678o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((fm3.b) obj).f264028a, wVar.f329677n)) {
                    break;
                }
            }
        }
        lVar.invoke(obj);
        wVar.dismiss();
    }
}

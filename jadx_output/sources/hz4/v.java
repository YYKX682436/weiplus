package hz4;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f286467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz4.u f286468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hz4.w f286469f;

    public v(hz4.w wVar, o72.r2 r2Var, hz4.u uVar) {
        this.f286469f = wVar;
        this.f286467d = r2Var;
        this.f286468e = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f286468e.f286455a;
        hz4.w wVar = this.f286469f;
        wVar.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        o72.r2 r2Var = this.f286467d;
        objArr[0] = java.lang.Boolean.valueOf(r2Var == null);
        objArr[1] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteMsgProcess", "processNoteData: start, originalNoteFavItemInfo null=%b, dealScene=%d", objArr);
        if (i17 == 10) {
            r45.bq0 bq0Var = r2Var == null ? new r45.bq0() : r2Var.field_favProto;
            o72.r2 r2Var2 = new o72.r2();
            r2Var2.field_localId = wVar.f286474x;
            r2Var2.field_favProto = bq0Var;
            wVar.f286421o = bq0Var;
            wVar.f286414e = r2Var2;
        }
        if (wVar.q()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteMsgProcess", "processNoteData: skip");
            return;
        }
        java.util.HashMap hashMap = hz4.w.M;
        if (hashMap.containsKey(wVar.f286471u)) {
            iz4.m mVar = (iz4.m) hashMap.get(wVar.f286471u);
            wVar.f286413d = mVar;
            mVar.f296126d = wVar.f286473w.longValue();
        } else {
            iz4.m mVar2 = new iz4.m();
            wVar.f286413d = mVar2;
            mVar2.f296126d = wVar.f286473w.longValue();
            wVar.f286413d.getClass();
            r45.ul5 ul5Var = wVar.C;
            if (ul5Var != null && ul5Var.f387465f != null) {
                if (ul5Var.f387467h != null) {
                    wVar.f286413d.getClass();
                    iz4.m mVar3 = wVar.f286413d;
                    java.lang.String str = wVar.C.f387467h.f385891d;
                    mVar3.getClass();
                    wVar.f286413d.f296127e = wVar.C.f387468i;
                }
                iz4.m mVar4 = wVar.f286413d;
                mVar4.f296123a = wVar.C.f387465f;
                hashMap.put(wVar.f286471u, mVar4);
            }
        }
        wVar.b(wVar.f286413d.f296123a, true, 4);
        mz4.j0 j0Var = mz4.j0.f333290v;
        if (j0Var == null || j0Var == null) {
            return;
        }
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) j0Var.f333300h;
        noteEditorUI.getClass();
        noteEditorUI.q7(true, false);
    }

    public java.lang.String toString() {
        return super.toString() + "|dealWNoteInfo";
    }
}

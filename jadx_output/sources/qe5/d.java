package qe5;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.e f362083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qe5.e eVar) {
        super(1);
        this.f362083d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kd5.e state = (kd5.e) obj;
        kotlin.jvm.internal.o.g(state, "state");
        android.support.v4.media.f.a(state.a(kd5.o.class));
        if (((kd5.q) state.a(kd5.q.class)) != null) {
            qe5.e eVar = this.f362083d;
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile absHandOffFile = eVar.f362088d;
            if (absHandOffFile == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.File.AppAttachHandOffUIC", "mHandOffFile is null");
            } else if (absHandOffFile.getFileStatus() != 1) {
                absHandOffFile.setFileStatus(1);
                androidx.appcompat.app.AppCompatActivity activity = eVar.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                com.tencent.mm.pluginsdk.model.app.d T6 = ((qe5.h) pf5.z.f353948a.a(activity).a(qe5.h.class)).T6();
                if (T6 != null) {
                    java.lang.String str = T6.field_fileFullPath;
                    int i17 = x51.t1.f452086a;
                    if (str == null) {
                        str = "";
                    }
                    absHandOffFile.setFullPath(str);
                }
                d73.i iVar = (d73.i) i95.n0.c(d73.i.class);
                iVar.Ja(absHandOffFile);
                iVar.Jc(absHandOffFile);
            }
        }
        return jz5.f0.f302826a;
    }
}

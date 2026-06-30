package yj4;

/* loaded from: classes11.dex */
public final class b implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yj4.d f462688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f462689b;

    public b(yj4.d dVar, com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f462688a = dVar;
        this.f462689b = textStatusEditActivity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        androidx.appcompat.app.AppCompatActivity activity = this.f462688a.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        yj4.f fVar = (yj4.f) pf5.z.f353948a.a(activity).a(yj4.f.class);
        fVar.getClass();
        fVar.f462697d = qj4.k.f363923f;
        fVar.O6(qj4.j.f363919g);
        this.f462689b.finish();
    }
}

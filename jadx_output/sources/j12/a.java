package j12;

/* loaded from: classes15.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.model.s f297149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j12.b f297150e;

    public a(j12.b bVar, com.tencent.mm.plugin.emoji.model.s sVar) {
        this.f297150e = bVar;
        this.f297149d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.emoji.model.s sVar = this.f297149d;
        if (sVar == null) {
            return;
        }
        j12.b bVar = this.f297150e;
        bVar.getClass();
        bVar.f297152e = new j12.f(sVar);
        bVar.notifyDataSetChanged();
    }
}

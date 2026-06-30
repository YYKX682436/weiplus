package i53;

/* loaded from: classes8.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f288748d;

    public v(i53.w wVar, java.util.List list) {
        this.f288748d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (i53.u uVar : this.f288748d) {
            if (uVar != null) {
                com.tencent.mm.plugin.game.commlib.util.m.f(uVar.field_filePath);
                com.tencent.mm.plugin.game.commlib.util.m.f(uVar.field_thumbPath);
                com.tencent.mm.plugin.game.commlib.util.m.f(uVar.field_compressPath);
            }
        }
    }
}

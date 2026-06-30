package gx1;

/* loaded from: classes12.dex */
public class v implements com.tencent.mm.plugin.component.editor.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ix1.m f277328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f277329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gx1.x f277330c;

    public v(gx1.x xVar, ix1.m mVar, android.content.Context context) {
        this.f277330c = xVar;
        this.f277328a = mVar;
        this.f277329b = context;
    }

    @Override // com.tencent.mm.plugin.component.editor.e
    public void a(com.tencent.mm.plugin.component.editor.c cVar, com.tencent.mm.plugin.component.editor.b bVar) {
        com.tencent.mm.plugin.component.editor.b bVar2 = com.tencent.mm.plugin.component.editor.b.SUCC;
        com.tencent.mm.plugin.component.editor.b bVar3 = com.tencent.mm.plugin.component.editor.b.OUT_OF_DATE;
        com.tencent.mm.plugin.component.editor.b bVar4 = com.tencent.mm.plugin.component.editor.b.ERR;
        if (bVar == bVar2 || bVar == bVar4 || bVar == bVar3) {
            this.f277330c.f277332d.C.dismiss();
            com.tencent.mm.plugin.component.editor.f fVar = com.tencent.mm.plugin.component.editor.f.f96553d;
            ((java.util.ArrayList) fVar.f96554a).remove(this.f277330c.f277332d.B);
        }
        if (bVar != bVar2) {
            if (bVar == bVar4 || bVar == bVar3) {
                ((ku5.t0) ku5.t0.f312615d).B(new gx1.u(this));
                return;
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_info_id", 0);
        intent.putExtra("key_detail_fav_path", this.f277328a.f295329r);
        intent.putExtra("key_detail_fav_thumb_path", this.f277328a.f295346s);
        intent.putExtra("key_detail_fav_video_duration", this.f277328a.f295347t);
        intent.putExtra("key_detail_data_id", this.f277328a.f295311a);
        intent.putExtra("key_detail_statExtStr", "");
        intent.putExtra("key_detail_fav_video_show_download_status", false);
        o72.x1.M0((android.app.Activity) this.f277330c.f277332d.f277304f.getContext(), ".ui.detail.FavoriteVideoPlayUI", intent, 1, null);
    }
}

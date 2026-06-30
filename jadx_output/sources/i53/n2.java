package i53;

/* loaded from: classes8.dex */
public class n2 implements vl1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i53.w2 f288676a;

    public n2(i53.w2 w2Var) {
        this.f288676a = w2Var;
    }

    @Override // vl1.p
    public void a(android.view.View view, int i17, long j17) {
        p33.l lVar;
        i53.w2 w2Var = this.f288676a;
        i53.k0 k0Var = w2Var.f288772g.f288671e2;
        if (i17 >= 0) {
            java.util.LinkedList linkedList = k0Var.f288627i;
            if (i17 < linkedList.size()) {
                lVar = (p33.l) linkedList.get(i17);
                if (!lVar.f351603e || lVar.f351604f) {
                }
                if (w2Var.f288777o) {
                    if (lVar.f351602d) {
                        ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(w2Var.getContext(), 6, lVar.f351614s, lVar.f351607i, null, null, w2Var.f288775m, null, w2Var.f288778p);
                        return;
                    } else {
                        ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(w2Var.getContext(), 6, lVar.f351614s, null, lVar.f351607i, lVar.f351606h, w2Var.f288775m, null, w2Var.f288778p);
                        return;
                    }
                }
                android.content.Intent intent = new android.content.Intent();
                p33.m mVar = new p33.m();
                java.util.LinkedList linkedList2 = w2Var.f288769d.f288720e;
                mVar.f351622d = linkedList2;
                int indexOf = linkedList2.indexOf(lVar);
                try {
                    intent.putExtra("game_video_list", mVar.toByteArray());
                    intent.putExtra("game_video_list_current_index", indexOf);
                    p33.q qVar = w2Var.f288769d.f288718c;
                    intent.putExtra("game_video_has_next", qVar != null && qVar.f351634g);
                    intent.putExtra("game_video_preview_source", i53.g4.FROM_TAB_GALLERY);
                    intent.putExtra("game_haowan_source_scene_id", w2Var.f288778p);
                    j45.l.n(w2Var.getContext(), "game", ".media.preview.GameVideoPreviewUI", intent, w2Var.f288775m);
                    return;
                } catch (java.io.IOException unused) {
                    return;
                }
            }
        } else {
            k0Var.getClass();
        }
        lVar = null;
        if (lVar.f351603e) {
        }
    }
}

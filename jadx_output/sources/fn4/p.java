package fn4;

/* loaded from: classes15.dex */
public class p implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI f264595d;

    public p(com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI) {
        this.f264595d = topStoryBaseVideoUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        sm4.j jVar = (sm4.j) m1Var;
        r45.mn6 mn6Var = (r45.mn6) jVar.f409953e.f70710a.f70684a;
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = this.f264595d;
        r45.xn6 xn6Var = jVar.f409955g;
        if (i17 == 0 && i18 == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("docId", mn6Var.f380697d);
                jSONObject.put("opType", "LIKE");
                jSONObject.put("isLike", mn6Var.f380699f == 4);
            } catch (org.json.JSONException unused) {
            }
            if (xn6Var != null) {
                boolean z17 = mn6Var.f380699f == 4;
                xn6Var.R = z17;
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "setCmtListener onSceneEnd succ, thumb: %s count: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(xn6Var.X));
                android.view.View view = null;
                if (mn6Var.f380699f == 4) {
                    fn4.m E = topStoryBaseVideoUI.t0().E(xn6Var);
                    r45.xn6 xn6Var2 = topStoryBaseVideoUI.f175126J.f264575d;
                    if (xn6Var2 != null && (str2 = xn6Var2.f390259h) != null && str2.equals(xn6Var.f390259h) && ((E instanceof hn4.d0) || (E instanceof gn4.d0))) {
                        view = E.j();
                    }
                    if (view != null) {
                        topStoryBaseVideoUI.f7(xn6Var, view, true);
                        if (E instanceof gn4.d0) {
                            E.i().getControlBar().x();
                        }
                    }
                } else {
                    if (((r45.nn6) jVar.f409953e.f70711b.f70700a).f381555e) {
                        db5.e1.s(topStoryBaseVideoUI, topStoryBaseVideoUI.getString(com.tencent.mm.R.string.f493394k11), "");
                    } else {
                        db5.t7.makeText(topStoryBaseVideoUI.getContext(), com.tencent.mm.R.string.f493395k12, 0).show();
                    }
                    topStoryBaseVideoUI.f7(xn6Var, null, false);
                }
            }
            com.tencent.mm.autogen.events.HaoKanActionEvent haoKanActionEvent = new com.tencent.mm.autogen.events.HaoKanActionEvent();
            java.lang.String jSONObject2 = jSONObject.toString();
            am.gh ghVar = haoKanActionEvent.f54431g;
            ghVar.f6762a = jSONObject2;
            ghVar.f6763b = "";
            haoKanActionEvent.e();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryBaseVideoUI", "NetSceneTopStorySetComment response, errType:%s, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            db5.t7.makeText(topStoryBaseVideoUI.getContext(), topStoryBaseVideoUI.getString(com.tencent.mm.R.string.k0_), 0).show();
            if (xn6Var != null) {
                xn6Var.R = !xn6Var.R;
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "setCmtListener onSceneEnd error, thumb:" + xn6Var.R);
            }
        }
        topStoryBaseVideoUI.runOnUiThread(new fn4.o(this, jVar));
    }
}

package vq4;

/* loaded from: classes14.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f439369a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f439370b;

    public o0(int i17) {
        this.f439369a = i17;
    }

    public void a(int i17, int i18, int i19) {
        java.util.Map map;
        if (this.f439370b == null) {
            this.f439370b = new java.util.HashMap();
        }
        if (this.f439370b.containsKey(java.lang.Integer.valueOf(i17))) {
            map = (java.util.Map) this.f439370b.get(java.lang.Integer.valueOf(i17));
        } else {
            map = new java.util.HashMap();
            this.f439370b.put(java.lang.Integer.valueOf(i17), map);
        }
        map.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public boolean b(int i17) {
        java.util.Map map = this.f439370b;
        if (map != null) {
            if (((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(this.f439369a))) {
                if (((java.util.Map) ((java.util.HashMap) this.f439370b).get(java.lang.Integer.valueOf(this.f439369a))).containsKey(java.lang.Integer.valueOf(i17))) {
                    return true;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipStateMachine", "state: %s don't contain rule for action: %s", vq4.n0.d(this.f439369a), vq4.n0.d(i17));
                return false;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipStateMachine", "no rule for state: %s", vq4.n0.d(this.f439369a));
        return false;
    }
}

package k14;

/* loaded from: classes11.dex */
public class t0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final int f303382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f303383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f303384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f303385g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k14.x0 f303386h;

    public t0(k14.x0 x0Var, int i17, java.util.List list, java.util.LinkedList linkedList, long j17) {
        this.f303386h = x0Var;
        this.f303383e = list;
        this.f303384f = linkedList;
        this.f303385g = j17;
        this.f303382d = i17;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        boolean z17;
        java.util.List list = vVar.f351160e;
        if (list == null || list.size() <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f303383e == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] list is null? %s ", objArr);
        } else {
            p13.y yVar = (p13.y) list.get(0);
            java.lang.Object obj = yVar.f351197o;
            if (obj == null || !(obj instanceof java.util.HashMap)) {
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                objArr2[0] = java.lang.Boolean.valueOf(obj == null);
                objArr2[1] = java.lang.Boolean.valueOf(yVar.f351197o instanceof java.util.HashMap);
                com.tencent.mars.xlog.Log.e("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] is null?%s is instanceof List", objArr2);
            } else {
                java.util.HashMap hashMap = (java.util.HashMap) obj;
                synchronized (this.f303386h.f303407f) {
                    for (java.lang.String str : this.f303383e) {
                        if (hashMap.containsKey(str)) {
                            java.util.Iterator it = ((java.util.List) hashMap.get(str)).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((p13.y) it.next()).f351186d < 100) {
                                        z17 = true;
                                        break;
                                    }
                                } else {
                                    z17 = false;
                                    break;
                                }
                            }
                            if (!z17) {
                                this.f303386h.f303410i.add(str);
                            }
                        } else {
                            this.f303386h.f303410i.add(str);
                        }
                    }
                }
            }
        }
        if (this.f303382d < this.f303384f.size()) {
            this.f303386h.a(this.f303384f, this.f303382d);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] finish all load! userNames.size:%s cost:%sms", java.lang.Integer.valueOf(this.f303384f.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f303385g));
            this.f303386h.f303405d.countDown();
        }
    }
}

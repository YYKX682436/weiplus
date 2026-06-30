package p13;

/* loaded from: classes12.dex */
public abstract class c implements java.lang.Comparable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f351066f;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f351069i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f351070m;

    /* renamed from: h, reason: collision with root package name */
    public long f351068h = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f351064d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f351065e = false;

    /* renamed from: g, reason: collision with root package name */
    public long f351067g = 0;

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f351064d - ((p13.c) obj).f351064d;
    }

    public java.lang.String getName() {
        return "";
    }

    public int getPriority() {
        return this.f351064d;
    }

    public final void h() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            try {
                i();
            } catch (java.lang.Exception e17) {
                throw e17;
            }
        } finally {
            this.f351067g += java.lang.System.currentTimeMillis() - currentTimeMillis;
        }
    }

    public abstract boolean i();

    public java.lang.String j() {
        return "";
    }

    public int k() {
        return -1;
    }

    public java.lang.String l() {
        java.util.List list = this.f351069i;
        if (list == null) {
            return "";
        }
        if (((java.util.ArrayList) list).size() <= 1) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 1; i17 < ((java.util.ArrayList) this.f351069i).size(); i17++) {
            p13.b bVar = (p13.b) ((java.util.ArrayList) this.f351069i).get(i17 - 1);
            p13.b bVar2 = (p13.b) ((java.util.ArrayList) this.f351069i).get(i17);
            stringBuffer.append("{");
            stringBuffer.append(bVar2.f351062a);
            stringBuffer.append(":");
            stringBuffer.append(bVar2.f351063b - bVar.f351063b);
            stringBuffer.append("}");
        }
        return java.lang.String.format("%s", stringBuffer.toString());
    }

    public boolean m() {
        return this.f351065e;
    }

    public void n() {
        this.f351065e = true;
    }

    public void o(java.lang.String str) {
        if (this.f351069i == null) {
            this.f351069i = new java.util.ArrayList();
        }
        p13.b bVar = new p13.b(this);
        bVar.f351062a = str;
        bVar.f351063b = java.lang.System.currentTimeMillis();
        this.f351069i.add(bVar);
    }
}

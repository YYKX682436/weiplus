package x91;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f452633a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f452634b;

    /* renamed from: c, reason: collision with root package name */
    public int f452635c;

    /* renamed from: d, reason: collision with root package name */
    public int f452636d;

    /* renamed from: e, reason: collision with root package name */
    public int f452637e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452638f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452639g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452640h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452641i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f452642j = new java.util.ArrayList();

    public c() {
        new java.util.ArrayList();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x91.c)) {
            return false;
        }
        x91.c cVar = (x91.c) obj;
        return this.f452634b.equals(cVar.f452634b) && this.f452635c == cVar.f452635c && this.f452641i.equals(cVar.f452641i);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList arrayList = this.f452642j;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x91.l lVar = (x91.l) it.next();
            sb6.append("[");
            sb6.append(lVar.toString());
            sb6.append("]\n");
        }
        return "host=" + this.f452634b + "\nport=" + this.f452635c + "\nmajor=" + this.f452636d + "\nminor=" + this.f452637e + "\ndeviceType=" + this.f452638f + "\nfriendlyName=" + this.f452639g + "\nmanufacturer=" + this.f452640h + "\nmodeName=null\nserviceCount=" + arrayList.size() + "\nserviceList=\n" + sb6.toString();
    }
}

package i21;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f287918a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f287919b;

    /* renamed from: c, reason: collision with root package name */
    public final int f287920c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f287921d;

    public s(java.lang.String str, java.util.LinkedList imgPathList) {
        kotlin.jvm.internal.o.g(imgPathList, "imgPathList");
        this.f287918a = str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f287919b = linkedList;
        this.f287921d = gm0.j1.b().h() + "" + java.lang.System.currentTimeMillis();
        linkedList.clear();
        linkedList.addAll(imgPathList);
        this.f287920c = linkedList.size();
    }
}

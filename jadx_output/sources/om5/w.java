package om5;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.w f346686d = new om5.w();

    public w() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.vfs.f6 storage = (com.tencent.mm.vfs.f6) obj;
        kotlin.jvm.internal.o.g(storage, "$this$storage");
        storage.f212926b = "files/host";
        storage.j("${data}/${dir}");
        storage.h();
        kz5.h0.w(storage.f212938n, new java.lang.String[]{"cgi-mapping_" + o45.wf.f343029g + ".xml", "errcode_list.ini", "host-redirect.xml", "hostredirect.ini", "ip.ini"});
        return jz5.f0.f302826a;
    }
}

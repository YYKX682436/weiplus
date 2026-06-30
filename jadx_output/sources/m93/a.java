package m93;

/* loaded from: classes8.dex */
public class a implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m93.h f325012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.r83 f325013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f325014c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m93.i f325015d;

    public a(m93.i iVar, m93.h hVar, r45.r83 r83Var, boolean z17) {
        this.f325015d = iVar;
        this.f325012a = hVar;
        this.f325013b = r83Var;
        this.f325014c = z17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        int i19;
        boolean z17;
        m93.a aVar = this;
        com.tencent.mars.xlog.Log.i("LiteApp.LiteAppGetA8Key", "errType:%d errCode:%d ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        boolean z18 = fVar instanceof r45.s83;
        m93.h hVar = aVar.f325012a;
        if (!z18) {
            com.tencent.mars.xlog.Log.e("LiteApp.LiteAppGetA8Key", "getA8Key call back resp is null");
            if (hVar != null) {
                hVar.a();
                return;
            }
            return;
        }
        r45.s83 s83Var = (r45.s83) fVar;
        com.tencent.mars.xlog.Log.i("LiteApp.LiteAppGetA8Key", "fullurl:" + s83Var.f385545d);
        java.lang.String str2 = s83Var.f385545d;
        if (str2 == null) {
            if (hVar != null) {
                hVar.a();
                return;
            }
            return;
        }
        int indexOf = str2.indexOf("?");
        if (indexOf < 0 || (i19 = indexOf + 1) >= s83Var.f385545d.length()) {
            com.tencent.mars.xlog.Log.e("LiteApp.LiteAppGetA8Key", "paramPos invalid");
            if (hVar != null) {
                hVar.a();
                return;
            }
            return;
        }
        java.lang.String substring = s83Var.f385545d.substring(i19);
        int indexOf2 = substring.indexOf("#");
        int i27 = 0;
        if (indexOf2 >= 0) {
            substring = substring.substring(0, indexOf2);
        }
        java.lang.String[] split = substring.split("&");
        if (split == null) {
            com.tencent.mars.xlog.Log.e("LiteApp.LiteAppGetA8Key", "params invalid");
            if (hVar != null) {
                hVar.a();
                return;
            }
            return;
        }
        m93.g gVar = new m93.g(aVar.f325015d);
        gVar.f325033b = aVar.f325013b.f384628y;
        int length = split.length;
        int i28 = 0;
        while (true) {
            z17 = aVar.f325014c;
            if (i28 >= length) {
                break;
            }
            java.lang.String str3 = split[i28];
            int indexOf3 = str3.indexOf(61);
            if (indexOf3 >= 0) {
                java.lang.String trim = str3.substring(i27, indexOf3).trim();
                ((java.util.HashMap) gVar.f325035d).put(trim, str3.substring(indexOf3 + 1).trim());
                if (z17 || (!trim.equals("uin") && !trim.equals("exportKey") && !trim.equals("exportkey") && !trim.equals("wx_header"))) {
                    if (gVar.f325032a == null) {
                        gVar.f325032a = str3;
                    } else {
                        gVar.f325032a += "&" + str3;
                    }
                }
            } else if (gVar.f325032a == null) {
                gVar.f325032a = str3;
            } else {
                gVar.f325032a += "&" + str3;
            }
            i28++;
            aVar = this;
            i27 = 0;
        }
        java.util.Iterator it = s83Var.f385562x.iterator();
        while (it.hasNext()) {
            r45.rx3 rx3Var = (r45.rx3) it.next();
            if (z17 || (!rx3Var.f385272d.equals("uin") && !rx3Var.f385272d.equals("exportKey") && !rx3Var.f385272d.equals("exportkey") && !rx3Var.f385272d.equals("wx_header"))) {
                ((java.util.HashMap) gVar.f325034c).put(rx3Var.f385272d, rx3Var.f385273e);
            }
        }
        if (hVar != null) {
            hVar.b(gVar);
        }
    }
}

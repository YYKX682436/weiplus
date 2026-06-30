package iw3;

/* loaded from: classes8.dex */
public final class e extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final iw3.e f295236d = new iw3.e();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        int hashCode = env.f340860a.hashCode();
        java.lang.String str = (java.lang.String) msg.f340790a.get("content");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) msg.f340790a.get("selectedStartIndex");
        if (str2 == null) {
            str2 = "0";
        }
        java.lang.String str3 = (java.lang.String) msg.f340790a.get("selectedEndIndex");
        java.lang.String str4 = str3 != null ? str3 : "0";
        int parseInt = java.lang.Integer.parseInt(str2);
        int parseInt2 = java.lang.Integer.parseInt(str4);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSelectedTextChanged", "JsApi-Call: key:" + hashCode + " select content:" + str + ", selectedStartIndex:" + str2 + ", selectedEndIndex:" + str4);
        uc0.v vVar = (uc0.v) ((java.util.concurrent.ConcurrentHashMap) hw3.a.f285583a).get(java.lang.Integer.valueOf(hashCode));
        if (vVar != null) {
            vVar.f426285e = str;
            vVar.f426286f = parseInt;
            vVar.f426287g = parseInt2;
            android.widget.Button button = vVar.f426290j;
            if (button != null) {
                button.setEnabled(!android.text.TextUtils.isEmpty(str));
            }
            uc0.m mVar = vVar.f426292l;
            if (mVar != null) {
                zv2.m mVar2 = ((zv2.d) mVar).f476400a;
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = mVar2.f476397f;
                if (finderJumpInfo != null) {
                    finderJumpInfo.setWording(str);
                }
                zv2.m.m(mVar2);
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = mVar2.f476397f;
                if (finderJumpInfo2 != null) {
                    finderJumpInfo2.setWording(mVar2.f476412h);
                }
            }
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "selectedTextChanged";
    }
}

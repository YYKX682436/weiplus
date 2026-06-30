package sc2;

/* loaded from: classes2.dex */
public class w2 extends ad2.h {

    /* renamed from: z, reason: collision with root package name */
    public static final sc2.u2 f406328z = new sc2.u2(null);

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f406329w = "FeedJumperAccountAroundObserver";

    /* renamed from: x, reason: collision with root package name */
    public xc2.p0 f406330x;

    /* renamed from: y, reason: collision with root package name */
    public kotlinx.coroutines.r2 f406331y;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(in5.s0 r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.w2.G(in5.s0):void");
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f406329w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 20) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.ya yaVar = wf6Var != null ? (r45.ya) wf6Var.getCustom(27) : null;
        java.lang.String string = yaVar != null ? yaVar.getString(0) : null;
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String l17 = l(string, y2Var.s(context, finderJumpInfo));
        return !(l17 == null || l17.length() == 0);
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        boolean z17;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.wf6) obj).getInteger(2) == 20) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.ya yaVar = wf6Var != null ? (r45.ya) wf6Var.getCustom(27) : null;
        if (infoEx.f453244f == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f406329w, "[onBindView] hashCode:" + hashCode() + "holder: " + holder.hashCode() + " holder position: " + holder.getPosition() + " feedId=" + pm0.v.u(this.f3145f) + " showPosition=" + infoEx.f453256r + " showStyle=" + infoEx.f453257s + " businessType=" + finderJumpInfo.getBusiness_type() + " jumpType=" + finderJumpInfo.getJumpinfo_type() + " title=" + finderJumpInfo.getRecommend_reason() + '|' + finderJumpInfo.getWording() + " icon_url=" + finderJumpInfo.getIcon_url() + " ext_info=" + finderJumpInfo.getExt_info() + ' ');
        android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.eeq);
        java.lang.String string = yaVar != null ? yaVar.getString(0) : null;
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        textView.setText(l(string, y2Var.s(context, finderJumpInfo)));
        java.lang.CharSequence text = textView.getText();
        if (text != null && text.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            this.f406330x = infoEx;
        }
        G(holder);
    }
}

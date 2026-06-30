package qe5;

/* loaded from: classes8.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.Button f362213a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f362214b;

    /* renamed from: c, reason: collision with root package name */
    public final oi3.g f362215c;

    /* renamed from: d, reason: collision with root package name */
    public final em.d0 f362216d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f362217e;

    public x0(android.widget.Button button, android.widget.TextView textView, oi3.g gVar, em.d0 d0Var) {
        this.f362213a = button;
        this.f362214b = textView;
        this.f362215c = gVar;
        this.f362216d = d0Var;
        if (textView != null) {
            int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MsgFileExpiredInterval", 432000);
            kotlin.jvm.internal.o.d(gVar);
            if (((int) java.lang.Math.floor(((b17 - c01.id.f(gVar.getLong(gVar.f345617d + 2) / 1000)) * 1.0d) / 86400)) >= 1) {
                if (textView == null) {
                    return;
                }
                textView.setText("");
            } else {
                if (textView == null) {
                    return;
                }
                textView.setText("");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r8) {
        /*
            r7 = this;
            android.widget.Button r0 = r7.f362213a
            if (r0 != 0) goto L5
            goto L8
        L5:
            r0.setVisibility(r8)
        L8:
            android.widget.TextView r1 = r7.f362214b
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L24
            java.lang.CharSequence r5 = r1.getText()
            java.lang.String r5 = r5.toString()
            int r5 = r5.length()
            if (r5 <= 0) goto L1f
            r5 = r2
            goto L20
        L1f:
            r5 = r4
        L20:
            if (r5 == 0) goto L24
            r5 = r1
            goto L25
        L24:
            r5 = r3
        L25:
            if (r5 != 0) goto L28
            goto L2b
        L28:
            r5.setVisibility(r8)
        L2b:
            if (r1 == 0) goto L37
            int r5 = r1.getVisibility()
            r6 = 8
            if (r5 != r6) goto L37
            r5 = r2
            goto L38
        L37:
            r5 = r4
        L38:
            if (r5 == 0) goto L80
            em.d0 r5 = r7.f362216d
            if (r5 == 0) goto L4c
            android.widget.TextView r6 = r5.k()
            if (r6 == 0) goto L4c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L4c
            r6 = r2
            goto L4d
        L4c:
            r6 = r4
        L4d:
            if (r6 != 0) goto L94
            if (r5 == 0) goto L5e
            android.widget.TextView r5 = r5.l()
            if (r5 == 0) goto L5e
            int r5 = r5.getVisibility()
            if (r5 != r8) goto L5e
            goto L5f
        L5e:
            r2 = r4
        L5f:
            if (r2 != 0) goto L94
            if (r0 == 0) goto L68
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            goto L69
        L68:
            r8 = r3
        L69:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            kotlin.jvm.internal.o.e(r8, r0)
            android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
            if (r1 == 0) goto L76
            android.content.Context r3 = r1.getContext()
        L76:
            r0 = 2131165403(0x7f0700db, float:1.7945022E38)
            int r0 = i65.a.h(r3, r0)
            r8.bottomMargin = r0
            goto L94
        L80:
            if (r0 == 0) goto L87
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            goto L88
        L87:
            r8 = r3
        L88:
            boolean r0 = r8 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L8f
            r3 = r8
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
        L8f:
            if (r3 != 0) goto L92
            goto L94
        L92:
            r3.bottomMargin = r4
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.x0.a(int):void");
    }

    public final void b(boolean z17, java.lang.String str) {
        android.content.res.Resources resources;
        java.lang.Object[] objArr = new java.lang.Object[1];
        oi3.g gVar = this.f362215c;
        objArr[0] = gVar != null ? java.lang.Long.valueOf(gVar.getLong(gVar.f345617d + 0)) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.File.FilePageLogicUIC", "showErrorTip overtime %s", objArr);
        android.widget.Button button = this.f362213a;
        if (button != null) {
            button.setVisibility(4);
        }
        android.widget.TextView textView = this.f362214b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (!z17) {
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.cex);
            }
            if (str != null) {
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
                byte[] bytes = str.getBytes(UTF_8);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                if (bytes.length > 255) {
                    if (textView != null) {
                        textView.setText(com.tencent.mm.R.string.f491236le2);
                    }
                }
            }
            jx3.f.INSTANCE.d(31328, 3, 5000);
        } else if (textView != null) {
            textView.setText(com.tencent.mm.R.string.cew);
        }
        if (textView != null && (resources = textView.getResources()) != null) {
            textView.setTextColor(resources.getColor(com.tencent.mm.R.color.Red_120));
        }
        if (this.f362217e) {
            return;
        }
        this.f362217e = true;
    }
}

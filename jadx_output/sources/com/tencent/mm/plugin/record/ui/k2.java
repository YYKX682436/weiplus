package com.tencent.mm.plugin.record.ui;

/* loaded from: classes5.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f155432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.TranslateMessageResultEvent f155433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.TranslateHelper$2 f155434g;

    public k2(com.tencent.mm.plugin.record.ui.TranslateHelper$2 translateHelper$2, java.lang.String str, int i17, com.tencent.mm.autogen.events.TranslateMessageResultEvent translateMessageResultEvent) {
        this.f155434g = translateHelper$2;
        this.f155431d = str;
        this.f155432e = i17;
        this.f155433f = translateMessageResultEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean find;
        java.lang.String str = this.f155431d;
        com.tencent.mm.autogen.events.TranslateMessageResultEvent translateMessageResultEvent = this.f155433f;
        com.tencent.mm.plugin.record.ui.TranslateHelper$2 translateHelper$2 = this.f155434g;
        try {
            bt3.f3 a17 = translateHelper$2.f155340d.a(new java.lang.Integer(str).intValue());
            int i18 = this.f155432e;
            if (i18 != 0) {
                if (i18 == 3) {
                    android.content.Context context = translateHelper$2.f155340d.f155442a;
                    db5.e1.T(context, context.getResources().getString(com.tencent.mm.R.string.b6n));
                } else if (i18 != 5) {
                    android.content.Context context2 = translateHelper$2.f155340d.f155442a;
                    db5.e1.T(context2, context2.getResources().getString(com.tencent.mm.R.string.b6c));
                }
                translateHelper$2.f155340d.f155443b.notifyDataSetChanged();
                return;
            }
            java.lang.String str2 = translateMessageResultEvent.f54905g.f7195c;
            com.tencent.mm.sdk.platformtools.t8.n(str2);
            a17.f24266f = str2;
            java.lang.String str3 = translateMessageResultEvent.f54905g.f7199g;
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mm.sdk.platformtools.t8.n(str3);
            a17.f24267g = str3;
            byte[] bArr = translateMessageResultEvent.f54905g.f7200h;
            if (bArr == null) {
                bArr = new byte[0];
            }
            a17.f24268h = new com.tencent.mm.protobuf.g(bArr);
            a17.f24269i = translateMessageResultEvent.f54905g.f7201i;
            a17.f24265e = 2;
            translateHelper$2.f155340d.f155443b.notifyDataSetChanged();
            com.tencent.mm.plugin.record.ui.l2 l2Var = translateHelper$2.f155340d;
            if (!l2Var.f155445d || (i17 = a17.f24264d + 1) >= l2Var.f155444c.f155342a.size()) {
                return;
            }
            java.lang.String str4 = ((r45.gp0) translateHelper$2.f155340d.f155444c.f155342a.get(i17)).f375408f;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                find = false;
            } else {
                int indexOf = str4.indexOf(58);
                if (indexOf != -1) {
                    str4 = str4.substring(indexOf + 1);
                }
                find = com.tencent.mm.sdk.platformtools.m2.j() ? com.tencent.mm.plugin.record.ui.l2.f155438h.matcher(str4).find() : com.tencent.mm.plugin.record.ui.l2.f155439i.matcher(str4).find();
            }
            if (find) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.record.ui.j2(this, i17));
            }
        } catch (java.lang.Exception e17) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[0] = str != null ? str : "";
            objArr[1] = e17.getClass().getSimpleName();
            objArr[2] = e17.getMessage();
            com.tencent.mars.xlog.Log.e("MicroMsg.TranslateHelper", "translateListener id:%s Exception:%s %s", objArr);
        }
    }
}

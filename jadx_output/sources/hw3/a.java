package hw3;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Map f285583a = new java.util.concurrent.ConcurrentHashMap();

    public static void a(android.content.Context context, java.lang.String str, int i17, int i18, uc0.p pVar) {
        b(context, new uc0.v(str, i17, i18, pVar));
    }

    public static void b(android.content.Context context, final uc0.v vVar) {
        final int hashCode = context.hashCode();
        r45.sn snVar = new r45.sn();
        snVar.f385851e = java.util.UUID.randomUUID().toString();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (vVar != null) {
            try {
                java.lang.String str = vVar.f426288h;
                if (str != null) {
                    hashMap.put("heading", fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
                }
            } catch (java.io.UnsupportedEncodingException unused) {
                com.tencent.mars.xlog.Log.e("SelectTextUILogic", "");
            }
            hashMap.put("businessType", java.lang.String.valueOf(vVar.f426289i));
        }
        java.lang.String c17 = com.tencent.mm.plugin.websearch.l2.g(11).c();
        hashMap.put("lang", com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
        hashMap.put("platform", com.eclipsesource.mmv8.Platform.ANDROID);
        hashMap.put("version", java.lang.String.valueOf(com.tencent.mm.plugin.websearch.l2.a(11)));
        hashMap.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, com.tencent.mm.plugin.websearch.l2.b());
        hashMap.put("isClientLoading", "1");
        hashMap.put("wechatVersion", com.tencent.mm.sdk.platformtools.z.f193111g);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
        stringBuffer.append(c17);
        stringBuffer.append("?");
        stringBuffer.append(com.tencent.mm.plugin.websearch.l2.k(hashMap));
        snVar.f385852f = stringBuffer.toString();
        final jw3.i iVar = new jw3.i(context, snVar, vVar.f426291k);
        iVar.show();
        iVar.getWindow().setLayout(-1, -1);
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: hw3.a$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.Object obj = new java.lang.Object();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                uc0.v vVar2 = uc0.v.this;
                arrayList.add(vVar2);
                jw3.i iVar2 = iVar;
                arrayList.add(iVar2);
                int i17 = hashCode;
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/remark/selecttext/SelectTextUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(vVar2);
                arrayList2.add(iVar2);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/remark/selecttext/SelectTextUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj2, array2);
                uc0.p pVar = vVar2.f426284d;
                if (pVar != null) {
                    pVar.a(vVar2.f426285e);
                    iVar2.dismiss();
                    ((java.util.concurrent.ConcurrentHashMap) hw3.a.f285583a).remove(java.lang.Integer.valueOf(i17));
                }
                yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/remark/selecttext/SelectTextUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/remark/selecttext/SelectTextUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        android.widget.Button button = iVar.f302329n;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
        vVar.f426290j = iVar.f302329n;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        f285583a = concurrentHashMap;
        concurrentHashMap.put(java.lang.Integer.valueOf(hashCode), vVar);
    }
}

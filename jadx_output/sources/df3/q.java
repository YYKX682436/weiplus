package df3;

/* loaded from: classes8.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.wemagic.WeMagicSclCommonStarterDemoUI f232032d;

    public q(com.tencent.mm.plugin.magicbrush.wemagic.WeMagicSclCommonStarterDemoUI weMagicSclCommonStarterDemoUI) {
        this.f232032d = weMagicSclCommonStarterDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df3.h hVar;
        kw5.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/wemagic/WeMagicSclCommonStarterDemoUI$initDynamicCardEnv$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.wemagic.WeMagicSclCommonStarterDemoUI weMagicSclCommonStarterDemoUI = this.f232032d;
        com.tencent.mars.xlog.Log.i(weMagicSclCommonStarterDemoUI.f148193d, "bindView");
        final android.widget.FrameLayout frameLayout = weMagicSclCommonStarterDemoUI.f148194e;
        if (frameLayout != null && (hVar = weMagicSclCommonStarterDemoUI.f148195f) != null && (bVar = hVar.f232023d) != null) {
            com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e eVar = new com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e();
            eVar.f220060d = "frames";
            boolean[] zArr = eVar.f220062f;
            zArr[1] = true;
            sw5.a aVar = hVar.f232022c;
            aVar.getClass();
            final yz5.l lVar = null;
            final qw5.b a17 = aVar.a(bVar, null);
            if (a17 != null) {
                ow5.a aVar2 = a17.f367230a;
                java.lang.String bizName = aVar2.f349430b;
                kotlin.jvm.internal.o.g(bizName, "bizName");
                java.lang.String str = zArr[1] ? eVar.f220060d : "";
                kotlin.jvm.internal.o.f(str, "getPath(...)");
                java.lang.String str2 = zArr[2] ? eVar.f220061e : "";
                kotlin.jvm.internal.o.f(str2, "getQuery(...)");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(bizName);
                sb6.append('_');
                if (!(str2.length() == 0)) {
                    str = str + '_' + str2;
                }
                sb6.append(str);
                java.lang.String frameSetRootId = sb6.toString();
                kotlin.jvm.internal.o.g(frameSetRootId, "frameSetRootId");
                java.lang.String viewId = frameSetRootId.concat("-mock_123");
                nw5.b bVar2 = lw5.a.f321662a;
                kotlin.jvm.internal.o.g(viewId, "viewId");
                nw5.b bVar3 = lw5.a.f321662a;
                bVar3.getClass();
                java.util.HashMap hashMap = (java.util.HashMap) bVar3.f341031a;
                if (((mw5.a) hashMap.get(viewId)) == null) {
                    hashMap.put(viewId, new nw5.a(a17.f367231b, aVar2.f349429a, new yz5.l() { // from class: qw5.b$$c
                        @Override // yz5.l
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            tw5.a view2 = (tw5.a) obj;
                            qw5.b this$0 = qw5.b.this;
                            kotlin.jvm.internal.o.g(this$0, "this$0");
                            android.view.ViewGroup containerView = frameLayout;
                            kotlin.jvm.internal.o.g(containerView, "$containerView");
                            kotlin.jvm.internal.o.g(view2, "view");
                            view2.setId(android.view.View.generateViewId());
                            containerView.addView(view2);
                            return jz5.f0.f302826a;
                        }
                    }, new yz5.l() { // from class: qw5.b$$d
                        @Override // yz5.l
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            tw5.a view2 = (tw5.a) obj;
                            qw5.b this$0 = qw5.b.this;
                            kotlin.jvm.internal.o.g(this$0, "this$0");
                            kotlin.jvm.internal.o.g(view2, "view");
                            yz5.l lVar2 = lVar;
                            if (lVar2 != null) {
                                lVar2.invoke(view2);
                            }
                            return jz5.f0.f302826a;
                        }
                    }));
                    com.tencent.wemagic.adframework.plugin.scl.zidl_gen.d dVar = new com.tencent.wemagic.adframework.plugin.scl.zidl_gen.d();
                    dVar.f220055d = "mock_123";
                    boolean[] zArr2 = dVar.f220059h;
                    zArr2[1] = true;
                    dVar.f220056e = "{\n        \"type\": 1,\n        \"data\": \"{\\\"iconUrl\\\":\\\"https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png\\\",\\\"pagIconUrl\\\":\\\"\\\",\\\"iconType\\\":0,\\\"recommendReason\\\":\\\"商品\\\",\\\"wording\\\":\\\"古琴零基础入门年课\\\"}\"\n    }";
                    zArr2[2] = true;
                    com.tencent.wemagic.adframework.plugin.scl.zidl_gen.b.f220042b.c(a17.f367231b, eVar, dVar);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/wemagic/WeMagicSclCommonStarterDemoUI$initDynamicCardEnv$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

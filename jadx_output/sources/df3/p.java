package df3;

/* loaded from: classes8.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.wemagic.WeMagicSclCommonStarterDemoUI f232031d;

    public p(com.tencent.mm.plugin.magicbrush.wemagic.WeMagicSclCommonStarterDemoUI weMagicSclCommonStarterDemoUI) {
        this.f232031d = weMagicSclCommonStarterDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        kw5.b a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/wemagic/WeMagicSclCommonStarterDemoUI$initDynamicCardEnv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.wemagic.WeMagicSclCommonStarterDemoUI weMagicSclCommonStarterDemoUI = this.f232031d;
        com.tencent.mars.xlog.Log.i(weMagicSclCommonStarterDemoUI.f148193d, "start");
        android.widget.FrameLayout frameLayout = weMagicSclCommonStarterDemoUI.f148194e;
        if (frameLayout != null) {
            df3.h hVar = weMagicSclCommonStarterDemoUI.f148195f;
            if (hVar == null) {
                androidx.appcompat.app.AppCompatActivity context = weMagicSclCommonStarterDemoUI.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                hVar = new df3.h(context, frameLayout);
                weMagicSclCommonStarterDemoUI.f148195f = hVar;
            }
            kw5.b bVar = hVar.f232023d;
            if (bVar == null) {
                sw5.a aVar = hVar.f232022c;
                df3.g gVar = new df3.g(hVar);
                synchronized (aVar) {
                    a17 = kw5.b.f313214b.a(((ow5.a) gVar.invoke()).f349430b, "");
                    aVar.a(a17, gVar);
                }
                hVar.f232023d = a17;
                bVar = a17;
            }
            sw5.a aVar2 = hVar.f232022c;
            aVar2.getClass();
            java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.LinkedHashMap) aVar2.f413492d).get(bVar);
            if (runnable != null) {
                aVar2.f413491c.removeCallbacks(runnable);
            }
            final qw5.b a18 = aVar2.a(bVar, null);
            if (a18 != null && a18.f367231b == 0) {
                new java.lang.ref.WeakReference(null);
                com.tencent.wemagic.adframework.plugin.scl.zidl_gen.f.f220063a = new qw5.b$$a();
                ow5.a aVar3 = a18.f367230a;
                java.util.Set W0 = kz5.n0.W0(aVar3.f349431c);
                boolean z17 = aVar3.f349436h;
                if (z17) {
                    kz5.h0.w(W0, new java.lang.Class[]{pw5.a.class, pw5.b.class, pw5.c.class, pw5.e.class});
                }
                cx5.a aVar4 = new cx5.a(a18, W0);
                java.lang.Class cls = aVar3.f349434f;
                if (cls != null) {
                    try {
                        java.lang.Object newInstance = java.lang.Class.forName(cls.getName()).getDeclaredConstructor(android.content.Context.class, com.tencent.wemagic.jsapi.base.MBBizContext.class, java.util.Set.class).newInstance(aVar3.f349429a, a18, aVar3.f349433e);
                        kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.wemagic.common.api.IMBJsAdaptor");
                        aVar4.f220099b = (com.tencent.wemagic.common.api.IMBJsAdaptor) newInstance;
                    } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException | java.lang.Exception unused) {
                    }
                }
                aVar4.a().size();
                com.tencent.wemagic.adframework.plugin.scl.zidl_gen.b bVar2 = com.tencent.wemagic.adframework.plugin.scl.zidl_gen.b.f220042b;
                com.tencent.wemagic.adframework.plugin.scl.zidl_gen.c cVar = new com.tencent.wemagic.adframework.plugin.scl.zidl_gen.c();
                cVar.f220044d = aVar3.f349430b;
                boolean[] zArr = cVar.f220054q;
                zArr[1] = true;
                cVar.f220046f = new java.util.LinkedList(aVar4.a());
                zArr[3] = true;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.addAll(aVar3.f349432d);
                cVar.f220049i = linkedList;
                zArr[6] = true;
                cVar.f220052o = z17;
                zArr[9] = true;
                java.util.HashMap hashMap = qw5.c.f367239a;
                java.lang.String str = cVar.f220054q[1] ? cVar.f220044d : "";
                kotlin.jvm.internal.o.f(str, "getBizName(...)");
                java.lang.String str2 = (java.lang.String) qw5.c.f367239a.get(str);
                if (str2 != null) {
                    boolean z18 = cVar.f220054q[1];
                    cVar.f220050m = str2;
                    zArr[7] = true;
                }
                cVar.f220047g = aVar3.f349437i;
                zArr[4] = true;
                cVar.f220053p = aVar3.f349438j != null;
                zArr[10] = true;
                long a19 = bVar2.a(cVar);
                a18.f367231b = a19;
                zw5.a aVar5 = yw5.a.f467000a;
                aVar5.getClass();
                aVar5.f476939a.put(java.lang.Long.valueOf(a19), new java.lang.ref.WeakReference(aVar4));
                xw5.d dVar = new xw5.d();
                yz5.a aVar6 = new yz5.a() { // from class: qw5.b$$b
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        yz5.a aVar7;
                        qw5.b this$0 = qw5.b.this;
                        kotlin.jvm.internal.o.g(this$0, "this$0");
                        vw5.d dVar2 = this$0.f367230a.f349438j;
                        if (dVar2 == null || (aVar7 = dVar2.f441217a) == null) {
                            return null;
                        }
                        return (android.widget.FrameLayout) aVar7.invoke();
                    }
                };
                if (dVar.f457748c == null || dVar.f457749d == null) {
                    dVar.f457748c = aVar6;
                    if (dVar.f457753h) {
                        dVar.a();
                    }
                } else {
                    java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
                    kotlin.jvm.internal.o.d(copyOf.length == 0 ? "init, but container has been provided" : java.lang.String.format("init, but container has been provided", java.util.Arrays.copyOf(copyOf, copyOf.length)));
                }
                yw5.a.f467001b.put(java.lang.Long.valueOf(a18.f367231b), dVar);
                a18.f367233d = dVar;
                bVar2.b(a18.f367231b);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/wemagic/WeMagicSclCommonStarterDemoUI$initDynamicCardEnv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

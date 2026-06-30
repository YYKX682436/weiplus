package i52;

/* loaded from: classes15.dex */
public final class a implements yj0.d {
    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (kotlin.jvm.internal.o.b(str, "com/tencent/mm/ui/chatting/ChattingUIFragment") && str2 != null) {
            switch (str2.hashCode()) {
                case -1799985168:
                    if (str2.equals("onEnterBegin") && kotlin.jvm.internal.o.b(str3, "()V") && !i52.b.f288469b) {
                        synchronized (i52.b.f288468a) {
                            java.util.Iterator it = ((java.util.ArrayList) i52.b.f288472e).iterator();
                            while (it.hasNext()) {
                                i52.c cVar = (i52.c) ((i52.m) it.next());
                                cVar.getClass();
                                i52.d.a(cVar.f288475a, 1, java.lang.System.currentTimeMillis());
                            }
                        }
                        i52.b.f288470c = true;
                        return;
                    }
                    return;
                case -1427566836:
                    if (str2.equals("onExitBegin") && kotlin.jvm.internal.o.b(str3, "()V") && !i52.b.f288469b) {
                        synchronized (i52.b.f288468a) {
                            java.util.Iterator it6 = ((java.util.ArrayList) i52.b.f288472e).iterator();
                            while (it6.hasNext()) {
                                i52.c cVar2 = (i52.c) ((i52.m) it6.next());
                                cVar2.getClass();
                                i52.d.a(cVar2.f288475a, 4, java.lang.System.currentTimeMillis());
                            }
                        }
                        i52.b.f288471d = true;
                        return;
                    }
                    return;
                case -112389456:
                    if (str2.equals("doAttach") && kotlin.jvm.internal.o.b(str3, "(Landroid/content/Context;)V")) {
                        i52.b.f288469b = true;
                        return;
                    }
                    return;
                case 20863998:
                    if (str2.equals("onExitEnd") && kotlin.jvm.internal.o.b(str3, "()V")) {
                        i52.b.f288469b = false;
                        java.util.Iterator it7 = i52.b.f288473f.iterator();
                        while (it7.hasNext()) {
                            ((e42.j0) it7.next()).u(obj);
                        }
                        return;
                    }
                    return;
                case 360443032:
                    if (str2.equals("doResume") && kotlin.jvm.internal.o.b(str3, "()V") && !i52.b.f288469b) {
                        if (i52.b.f288470c) {
                            i52.b.f288470c = false;
                            return;
                        }
                        synchronized (i52.b.f288468a) {
                            java.util.Iterator it8 = ((java.util.ArrayList) i52.b.f288472e).iterator();
                            while (it8.hasNext()) {
                                i52.c cVar3 = (i52.c) ((i52.m) it8.next());
                                cVar3.getClass();
                                i52.d.a(cVar3.f288475a, 2, java.lang.System.currentTimeMillis());
                            }
                        }
                        return;
                    }
                    return;
                case 1810778155:
                    if (str2.equals("doPause") && kotlin.jvm.internal.o.b(str3, "()V") && !i52.b.f288469b) {
                        if (i52.b.f288471d) {
                            i52.b.f288471d = false;
                            return;
                        }
                        synchronized (i52.b.f288468a) {
                            java.util.Iterator it9 = ((java.util.ArrayList) i52.b.f288472e).iterator();
                            while (it9.hasNext()) {
                                i52.c cVar4 = (i52.c) ((i52.m) it9.next());
                                cVar4.getClass();
                                i52.d.a(cVar4.f288475a, 3, java.lang.System.currentTimeMillis());
                            }
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}

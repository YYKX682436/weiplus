package q5;

/* loaded from: classes13.dex */
public final class b implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f360134d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static volatile q5.b f360135e;

    public static q5.b a() {
        if (f360135e == null) {
            synchronized (q5.b.class) {
                if (f360135e == null) {
                    f360135e = new q5.b();
                }
            }
        }
        return f360135e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
                java.util.Objects.toString(activity);
                mk.a aVar = xy5.b.f458162a;
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                a.a aVar = (a.a) ((q5.a) it.next());
                aVar.f42b.f45b.e(activity);
                aVar.f42b.f46c.remove(java.lang.Integer.valueOf(activity.hashCode()));
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
                java.util.Objects.toString(activity);
                mk.a aVar = xy5.b.f458162a;
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).a(activity);
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                ((q5.a) it.next()).getClass();
                java.util.Objects.toString(activity);
                mk.a aVar = xy5.b.f458162a;
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final android.app.Activity activity) {
        java.util.Iterator it = f360134d.iterator();
        while (it.hasNext()) {
            try {
                a.a aVar = (a.a) ((q5.a) it.next());
                aVar.getClass();
                a.b bVar = aVar.f42b;
                final ry5.c f17 = ry5.c.f();
                if (activity == null) {
                    f17.getClass();
                } else {
                    f17.f401705c.post(new java.lang.Runnable() { // from class: ry5.c$$h
                        @Override // java.lang.Runnable
                        public final void run() {
                            ry5.c cVar = ry5.c.this;
                            cVar.getClass();
                            android.app.Activity activity2 = activity;
                            java.lang.String simpleName = activity2.getClass().getSimpleName();
                            java.lang.String b17 = a.b.c().b();
                            java.lang.Long l17 = (java.lang.Long) a.b.c().f46c.get(java.lang.Integer.valueOf(activity2.hashCode()));
                            long longValue = l17 != null ? l17.longValue() : java.lang.System.currentTimeMillis();
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(ry5.d.a());
                            sb6.append(";");
                            sb6.append(ry5.d.j());
                            sb6.append(";2;");
                            ((my1.c) a.b.c().f49f).getClass();
                            sb6.append(o45.wf.f343029g);
                            java.lang.String sb7 = sb6.toString();
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            try {
                                jSONObject.put("action", 8);
                                jSONObject.put("uin", b17);
                                jSONObject.put("startTime", longValue);
                                jSONObject.put("pageName", simpleName);
                                jSONObject.put("clientInfo", sb7);
                                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "");
                            } catch (org.json.JSONException unused) {
                            }
                            cVar.f401704b.c(jSONObject.toString());
                        }
                    });
                }
                bVar.f45b.e(activity);
                bVar.f46c.remove(java.lang.Integer.valueOf(activity.hashCode()));
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", e17.getMessage());
            }
        }
    }
}

package j7;

/* loaded from: classes13.dex */
public class q implements android.os.Handler.Callback {

    /* renamed from: i, reason: collision with root package name */
    public static final j7.p f298018i = new j7.o();

    /* renamed from: d, reason: collision with root package name */
    public volatile com.bumptech.glide.r f298019d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f298020e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f298021f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f298022g;

    /* renamed from: h, reason: collision with root package name */
    public final j7.p f298023h;

    public q(j7.p pVar) {
        new android.os.Bundle();
        this.f298023h = pVar == null ? f298018i : pVar;
        this.f298022g = new android.os.Handler(android.os.Looper.getMainLooper(), this);
    }

    public static android.app.Activity a(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return a(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean e(android.content.Context context) {
        android.app.Activity a17 = a(context);
        return a17 == null || !a17.isFinishing();
    }

    public com.bumptech.glide.r b(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = q7.p.f360310a;
        if ((android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) && !(context instanceof android.app.Application)) {
            if (context instanceof androidx.fragment.app.FragmentActivity) {
                androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) context;
                if (!(android.os.Looper.myLooper() == android.os.Looper.getMainLooper())) {
                    return b(fragmentActivity.getApplicationContext());
                }
                if (fragmentActivity.isDestroyed()) {
                    throw new java.lang.IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                com.bumptech.glide.manager.SupportRequestManagerFragment d17 = d(fragmentActivity.getSupportFragmentManager(), null, e(fragmentActivity));
                com.bumptech.glide.r rVar = d17.f43973h;
                if (rVar != null) {
                    return rVar;
                }
                com.bumptech.glide.c b17 = com.bumptech.glide.c.b(fragmentActivity);
                j7.r rVar2 = d17.f43970e;
                ((j7.o) this.f298023h).getClass();
                com.bumptech.glide.r rVar3 = new com.bumptech.glide.r(b17, d17.f43969d, rVar2, fragmentActivity);
                d17.f43973h = rVar3;
                return rVar3;
            }
            if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                if (!(android.os.Looper.myLooper() == android.os.Looper.getMainLooper())) {
                    return b(activity.getApplicationContext());
                }
                if (activity.isDestroyed()) {
                    throw new java.lang.IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                j7.n c17 = c(activity.getFragmentManager(), null, e(activity));
                com.bumptech.glide.r rVar4 = c17.f298015g;
                if (rVar4 != null) {
                    return rVar4;
                }
                com.bumptech.glide.c b18 = com.bumptech.glide.c.b(activity);
                j7.r rVar5 = c17.f298013e;
                ((j7.o) this.f298023h).getClass();
                com.bumptech.glide.r rVar6 = new com.bumptech.glide.r(b18, c17.f298012d, rVar5, activity);
                c17.f298015g = rVar6;
                return rVar6;
            }
            if (context instanceof android.content.ContextWrapper) {
                android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f298019d == null) {
            synchronized (this) {
                if (this.f298019d == null) {
                    com.bumptech.glide.c b19 = com.bumptech.glide.c.b(context.getApplicationContext());
                    j7.p pVar = this.f298023h;
                    j7.b bVar = new j7.b();
                    j7.i iVar = new j7.i();
                    android.content.Context applicationContext = context.getApplicationContext();
                    ((j7.o) pVar).getClass();
                    this.f298019d = new com.bumptech.glide.r(b19, bVar, iVar, applicationContext);
                }
            }
        }
        return this.f298019d;
    }

    public final j7.n c(android.app.FragmentManager fragmentManager, android.app.Fragment fragment, boolean z17) {
        j7.n nVar = (j7.n) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (nVar != null) {
            return nVar;
        }
        java.util.Map map = this.f298020e;
        j7.n nVar2 = (j7.n) ((java.util.HashMap) map).get(fragmentManager);
        if (nVar2 == null) {
            nVar2 = new j7.n();
            nVar2.f298017i = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                nVar2.a(fragment.getActivity());
            }
            if (z17) {
                nVar2.f298012d.d();
            }
            ((java.util.HashMap) map).put(fragmentManager, nVar2);
            fragmentManager.beginTransaction().add(nVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f298022g.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return nVar2;
    }

    public final com.bumptech.glide.manager.SupportRequestManagerFragment d(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, boolean z17) {
        com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment = (com.bumptech.glide.manager.SupportRequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.f298021f;
        com.bumptech.glide.manager.SupportRequestManagerFragment supportRequestManagerFragment2 = (com.bumptech.glide.manager.SupportRequestManagerFragment) hashMap.get(fragmentManager);
        if (supportRequestManagerFragment2 == null) {
            supportRequestManagerFragment2 = new com.bumptech.glide.manager.SupportRequestManagerFragment();
            supportRequestManagerFragment2.f43974i = fragment;
            if (fragment != null && fragment.getContext() != null) {
                androidx.fragment.app.Fragment fragment2 = fragment;
                while (fragment2.getParentFragment() != null) {
                    fragment2 = fragment2.getParentFragment();
                }
                androidx.fragment.app.FragmentManager fragmentManager2 = fragment2.getFragmentManager();
                if (fragmentManager2 != null) {
                    supportRequestManagerFragment2.j0(fragment.getContext(), fragmentManager2);
                }
            }
            if (z17) {
                supportRequestManagerFragment2.f43969d.d();
            }
            hashMap.put(fragmentManager, supportRequestManagerFragment2);
            androidx.fragment.app.i2 beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.h(0, supportRequestManagerFragment2, "com.bumptech.glide.manager", 1);
            beginTransaction.e();
            this.f298022g.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment2;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.lang.Object obj;
        java.lang.Object remove;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i17 = message.what;
        boolean z17 = true;
        if (i17 == 1) {
            obj = (android.app.FragmentManager) message.obj;
            remove = ((java.util.HashMap) this.f298020e).remove(obj);
        } else {
            if (i17 != 2) {
                obj3 = null;
                z17 = false;
                obj2 = null;
                if (z17 && obj3 == null && android.util.Log.isLoggable("RMRetriever", 5)) {
                    java.util.Objects.toString(obj2);
                }
                return z17;
            }
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            remove = ((java.util.HashMap) this.f298021f).remove(obj);
        }
        java.lang.Object obj4 = remove;
        obj2 = obj;
        obj3 = obj4;
        if (z17) {
            java.util.Objects.toString(obj2);
        }
        return z17;
    }
}

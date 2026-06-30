package kn5;

/* loaded from: classes10.dex */
public final class e implements androidx.recyclerview.widget.v2 {
    public static final kn5.b E = new kn5.b(null);
    public boolean A;
    public int B;
    public boolean C;
    public kn5.c D;

    /* renamed from: d, reason: collision with root package name */
    public final kn5.a f309787d;

    /* renamed from: g, reason: collision with root package name */
    public int f309790g;

    /* renamed from: h, reason: collision with root package name */
    public int f309791h;

    /* renamed from: i, reason: collision with root package name */
    public int f309792i;

    /* renamed from: m, reason: collision with root package name */
    public final int f309793m;

    /* renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f309795o;

    /* renamed from: q, reason: collision with root package name */
    public int f309797q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f309798r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f309799s;

    /* renamed from: t, reason: collision with root package name */
    public int f309800t;

    /* renamed from: u, reason: collision with root package name */
    public int f309801u;

    /* renamed from: v, reason: collision with root package name */
    public int f309802v;

    /* renamed from: w, reason: collision with root package name */
    public int f309803w;

    /* renamed from: x, reason: collision with root package name */
    public int f309804x;

    /* renamed from: y, reason: collision with root package name */
    public int f309805y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f309806z;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f309788e = new android.os.Handler();

    /* renamed from: f, reason: collision with root package name */
    public final kn5.d f309789f = new kn5.d(this);

    /* renamed from: n, reason: collision with root package name */
    public final kn5.i f309794n = kn5.i.f309809d;

    /* renamed from: p, reason: collision with root package name */
    public int f309796p = -1;

    static {
        com.tencent.mars.xlog.Log.isDebug();
    }

    public e(android.content.Context context, kn5.a aVar, kotlin.jvm.internal.i iVar) {
        this.f309787d = aVar;
        this.f309790g = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479878hr);
        this.f309793m = (int) ((((int) (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479873hm) * 2.5d)) / 1000) * 25);
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView view, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/dragselect/DragSelectTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        if (this.f309799s) {
            yj0.a.h(this, "com/tencent/mm/view/recyclerview/dragselect/DragSelectTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
            return;
        }
        int action = event.getAction();
        android.graphics.Rect rect = kn5.f.f309807a;
        int a17 = kn5.f.a(view, event.getX(), event.getY());
        float y17 = event.getY();
        if (action == 1) {
            d();
            yj0.a.h(this, "com/tencent/mm/view/recyclerview/dragselect/DragSelectTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
            return;
        }
        if (action == 2) {
            if (this.f309790g > -1) {
                float f17 = this.f309802v;
                android.os.Handler handler = this.f309788e;
                int i17 = this.f309793m;
                kn5.d dVar = this.f309789f;
                if (y17 >= f17 && y17 <= this.f309803w) {
                    this.A = false;
                    if (!this.f309806z) {
                        this.f309806z = true;
                        handler.removeCallbacks(dVar);
                        handler.postDelayed(dVar, 25L);
                        if (!this.C) {
                            this.C = true;
                        }
                    }
                    this.B = i17;
                } else if (y17 >= this.f309804x && y17 <= this.f309805y) {
                    this.f309806z = false;
                    if (!this.A) {
                        this.A = true;
                        handler.removeCallbacks(dVar);
                        handler.postDelayed(dVar, 25L);
                        if (!this.C) {
                            this.C = true;
                        }
                    }
                    this.B = i17;
                } else if (this.f309806z || this.A) {
                    handler.removeCallbacks(dVar);
                    if (this.C) {
                        this.C = false;
                    }
                    this.f309806z = false;
                    this.A = false;
                }
            }
            e(a17);
            if (a17 != -1) {
                kn5.c cVar = this.D;
                if (cVar != null) {
                    cVar.f309784a = event.getX();
                    cVar.f309785b = event.getY();
                } else {
                    cVar = new kn5.c(event);
                }
                this.D = cVar;
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/recyclerview/dragselect/DragSelectTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView view, android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        this.f309799s = false;
        androidx.recyclerview.widget.f2 adapter = view.getAdapter();
        boolean z17 = this.f309798r && !((adapter != null ? adapter.getItemCount() : 0) == 0);
        if (z17) {
            this.f309795o = view;
            view.getMeasuredHeight();
            int i17 = this.f309790g;
            if (i17 > -1) {
                this.f309802v = 0;
                this.f309803w = i17 + 0;
                this.f309804x = (view.getMeasuredHeight() - this.f309790g) - 0;
                int measuredHeight = view.getMeasuredHeight() - 0;
                this.f309805y = measuredHeight;
                int i18 = this.f309791h;
                if (i18 != 0) {
                    this.f309802v += i18;
                }
                int i19 = this.f309792i;
                if (i19 != 0) {
                    this.f309805y = measuredHeight + i19;
                }
            }
        }
        if (z17 && event.getAction() == 1) {
            d();
        }
        return z17;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }

    public final void d() {
        this.f309798r = false;
        this.f309806z = false;
        this.A = false;
        this.f309788e.removeCallbacks(this.f309789f);
        if (this.C) {
            this.C = false;
        }
        this.D = null;
    }

    public final void e(int i17) {
        int i18;
        int i19;
        java.lang.System.currentTimeMillis();
        kn5.i iVar = kn5.i.f309810e;
        kn5.a aVar = this.f309787d;
        kn5.i iVar2 = this.f309794n;
        if (iVar2 == iVar && i17 != -1) {
            if (this.f309796p == i17) {
                return;
            }
            this.f309796p = i17;
            aVar.a(i17, !aVar.c(i17));
            return;
        }
        if (iVar2 != kn5.i.f309809d || i17 == -1 || this.f309796p == i17) {
            return;
        }
        this.f309796p = i17;
        if (this.f309800t == -1) {
            this.f309800t = i17;
        }
        if (this.f309801u == -1) {
            this.f309801u = i17;
        }
        if (i17 > this.f309801u) {
            this.f309801u = i17;
        }
        if (i17 < this.f309800t) {
            this.f309800t = i17;
        }
        int i27 = this.f309797q;
        int i28 = this.f309800t;
        int i29 = this.f309801u;
        if (i27 == i17) {
            if (i28 <= i29) {
                while (true) {
                    if (i28 != i27) {
                        aVar.a(i28, false);
                    }
                    if (i28 == i29) {
                        break;
                    } else {
                        i28++;
                    }
                }
            }
        } else if (i17 < i27) {
            if (i17 <= i27) {
                int i37 = i27;
                while (true) {
                    aVar.a(i37, true);
                    if (i37 == i17) {
                        break;
                    } else {
                        i37--;
                    }
                }
            }
            if (i28 > -1 && i28 < i17) {
                while (i28 < i17) {
                    if (i28 != i27) {
                        aVar.a(i28, false);
                    }
                    i28++;
                }
            }
            if (i29 > -1 && (i19 = i27 + 1) <= i29) {
                while (true) {
                    aVar.a(i19, false);
                    if (i19 == i29) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
        } else {
            if (i27 <= i17) {
                int i38 = i27;
                while (true) {
                    aVar.a(i38, true);
                    if (i38 == i17) {
                        break;
                    } else {
                        i38++;
                    }
                }
            }
            if (i29 > -1 && i29 > i17 && (i18 = i17 + 1) <= i29) {
                while (true) {
                    if (i18 != i27) {
                        aVar.a(i18, false);
                    }
                    if (i18 == i29) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            if (i28 > -1) {
                while (i28 < i27) {
                    aVar.a(i28, false);
                    i28++;
                }
            }
        }
        int i39 = this.f309797q;
        int i47 = this.f309796p;
        if (i39 == i47) {
            this.f309800t = i47;
            this.f309801u = i47;
        }
    }

    public final boolean f(boolean z17, int i17) {
        if (z17 && this.f309798r) {
            return false;
        }
        this.f309796p = -1;
        this.f309800t = -1;
        this.f309801u = -1;
        this.f309788e.removeCallbacks(this.f309789f);
        if (this.C) {
            this.C = false;
        }
        this.f309806z = false;
        this.A = false;
        if (!z17) {
            this.f309797q = -1;
            return false;
        }
        kn5.a aVar = this.f309787d;
        if (!aVar.b(i17)) {
            this.f309798r = false;
            this.f309797q = -1;
            return false;
        }
        aVar.a(i17, true);
        this.f309798r = z17;
        this.f309797q = i17;
        this.f309796p = i17;
        return true;
    }
}
